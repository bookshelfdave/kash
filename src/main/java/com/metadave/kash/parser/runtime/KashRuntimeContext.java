package com.metadave.kash.parser.runtime;

import org.I0Itec.zkclient.ZkClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dparfitt on 7/3/15.
 */
public class KashRuntimeContext {
    ZkClient zk;

    private List<Throwable> errors = new ArrayList<Throwable>();

    public KashRuntimeContext() {
    }

    public List<Throwable> getErrors() {
        return errors;
    }

    public ZkClient getZk() {
        return zk;
    }

    public void setZk(ZkClient zk) {
        this.zk = zk;
    }
}
