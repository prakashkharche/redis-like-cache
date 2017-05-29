package com.kodergeek.datastore.ds;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class StringDS extends DataStructure{
    public String value;

    public StringDS(String value) {
        super(Type.STRING);
        this.value = value;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
