package com.kodergeek.datastore.ds;

import java.util.Map;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class HashDS extends DataStructure{
    public Map<String, String> value;

    public HashDS(Map<String, String> value) {
        super(Type.HASH);
        this.value = value;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
