/*
 * -------------------------------------------------------------------
 *
 * Copyright (c) 2015 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

package com.metadave.kash.parser.runtime;

import com.metadave.kash.parser.KashBaseListener;
import com.metadave.kash.parser.KashParser;
import com.metadave.kash.parser.ParseUtils;
import org.I0Itec.zkclient.ZkClient;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import kafka.admin.TopicCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KashWalker extends KashBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

    public KashRuntimeContext runtimeCtx = null;

    public KashWalker(KashRuntimeContext ctx) {
        this.runtimeCtx = ctx;
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }


    @Override
    public void exitConnect_stmt(KashParser.Connect_stmtContext ctx) {
        HostPort hostport = (HostPort)getValue(ctx.hostport);
        System.out.println("Connecting");
        runtimeCtx.setZk(new ZkClient(hostport.toString()));
        System.out.println("Connected");

    }

    @Override
    public void exitCreate_topic(KashParser.Create_topicContext ctx) {
        // TODO: make a util method that parses single + double quotes
        String topicname = ParseUtils.stripDoubleQuotes(ctx.topicname.getText());
        String[] topics = {topicname};

        // create topic "xyz" with replication-factor=1 and partitions=1;
        //--replication-factor 1 --partitions 1 --topic test

        Map<String, Object> kvs = (Map<String, Object>)getValue(ctx.keyvalues());
        List<String> params = new ArrayList<String>();
        params.add("--create");
        params.add("--topic");
        params.add(topicname);
        for(String key : kvs.keySet()) {
            params.add("--" + key);
            params.add(kvs.get(key).toString());
        }
        System.out.println(params);
        String[] args = params.toArray(new String[params.size()]);
        TopicCommand.TopicCommandOptions opts = new TopicCommand.TopicCommandOptions(args);
        TopicCommand.createTopic(runtimeCtx.getZk(), opts);
        //kafka.admin.TopicCommand.describeTopic(runtimeCtx.getZk(), opts);

    }

    @Override
    public void exitDescribe_topic(KashParser.Describe_topicContext ctx) {
        String topicname = ParseUtils.stripDoubleQuotes(ctx.topicname.getText());
        List<String> params = new ArrayList<String>();
        params.add("--describe");
        params.add("--topic");
        params.add(topicname);
        System.out.println(params);
        String[] args = params.toArray(new String[params.size()]);
        TopicCommand.TopicCommandOptions opts = new TopicCommand.TopicCommandOptions(args);
        TopicCommand.describeTopic(runtimeCtx.getZk(), opts);
    }

    @Override
    public void exitHostport(KashParser.HostportContext ctx) {
        String host = ctx.host.getText();
        String port = ctx.port.getText();
        setValue(ctx, new HostPort(host, Integer.parseInt(port)));
    }


    @Override
    public void exitKeyvalues(KashParser.KeyvaluesContext ctx) {
        Map<String, Object> allkvs = new HashMap<String, Object>();
        for(KashParser.KeyvalueContext k : ctx.kvs) {
            KeyValue kv = (KeyValue) getValue(k);
            allkvs.put(kv.getKey(), kv.getValue());
        }
        setValue(ctx, allkvs);
    }

    @Override
    public void exitKeyvalue(KashParser.KeyvalueContext ctx) {
        KeyValue kv = new KeyValue(ctx.keyname.getText(), getValue(ctx.thevalue));
        setValue(ctx, kv);
    }

    @Override
    public void exitValuetype(KashParser.ValuetypeContext ctx) {
        if(ctx.string_value() != null) {
            setValue(ctx, getValue(ctx.string_value()));
        } else if(ctx.INT() != null) {
            Integer i = Integer.parseInt(ctx.INT().getText());
            setValue(ctx, i);
        } else if(ctx.FLOAT() != null) {

        }
    }

    @Override
    public void exitString_value(KashParser.String_valueContext ctx) {
        if(ctx.SINGLE_STRING() != null) {
            setValue(ctx, ParseUtils.stripSingleQuotes(ctx.SINGLE_STRING().getText()));
        } else if(ctx.DOUBLE_STRING() != null) {
            setValue(ctx, ParseUtils.stripDoubleQuotes(ctx.DOUBLE_STRING().getText()));
        }
    }
}
