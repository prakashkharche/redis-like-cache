package com.kodergeek.datastore;

import com.kodergeek.datastore.ds.DataStructure;
import com.kodergeek.datastore.ds.Type;

import java.util.Optional;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public interface DataStore {
    Optional<DataStructure> get(String key);
    void add(String key, DataStructure dataStructure);
    void delete(String key);
    //Optional<Type> getType(String key);
}
