package com.kodergeek.datastore.ds;

import java.util.List;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class ListDS extends DataStructure{
    public List<String> value;

    public ListDS(List<String> value) {
        super(Type.LIST);
        this.value = value;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
