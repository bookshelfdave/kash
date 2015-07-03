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

package com.metadave.kash.parser;

import com.metadave.kash.KashErrorListener;
import com.metadave.kash.parser.runtime.KashRuntimeContext;
import com.metadave.kash.parser.runtime.KashWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.File;
import java.net.URL;

public class KashParserTest {

//    @Test
//    public void testQueryParsing() {
//        try {
//            String script = KashParserTest.loadResource("connections.test");
//            testScript(script);
//        } catch (Throwable e) {
//            e.printStackTrace();
//            Assert.fail();
//        }
//    }


    public void testConnectionsEval() throws Throwable {
        String script = KashParserTest.loadResource("connections.test");
        testEvalScript(script);
    }

    private void testEvalScript(String script) throws Throwable {
        KashRuntimeContext ctx = new KashRuntimeContext();
        ANTLRInputStream input = new ANTLRInputStream(script);
        KashLexer lexer = new KashLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KashParser parser = new KashParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        KashWalker esq = new KashWalker(ctx);
        parser.addErrorListener(new KashErrorListener());
        KashParser.StmtsContext qc = parser.stmts();
        // TODO: uncomment this when test data is setup
        //walker.walk(esq, qc);
    }


//    private void testScript(String script) throws Throwable {
//        ANTLRInputStream input = new ANTLRInputStream(script);
//        KashLexer lexer = new KashLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        KashParser parser = new KashParser(tokens);
//        parser.addErrorListener(new KashErrorListener());
//        parser.stmts();
//    }

    public static String loadResource(String name) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(name);
        File f = new File(url.getPath());
        return org.apache.commons.io.FileUtils.readFileToString(f, "UTF-8");
    }
}
