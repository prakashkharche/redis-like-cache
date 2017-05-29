package com.kodergeek.datastore.ds;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public abstract class DataStructure {

    protected Type type;
    public DataStructure(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public abstract Object getValue();
}
