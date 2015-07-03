package com.metadave.kash.parser.runtime;

/**
 * Created by dparfitt on 7/3/15.
 * just look how 1991 this class is
 */
public class KeyValue {
    String key;
    Object value;

    public KeyValue(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "[" + key + " = " + value.toString() + "]";
    }
}
