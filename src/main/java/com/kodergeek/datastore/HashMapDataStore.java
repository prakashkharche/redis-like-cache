package com.kodergeek.datastore;

import com.kodergeek.datastore.ds.DataStructure;
import com.kodergeek.datastore.ds.Type;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class HashMapDataStore implements DataStore{

    private Map<String, DataStructure> store;

    public HashMapDataStore() {
        this.store = new HashMap<>();
    }

    public Optional<DataStructure> get(String key) {
        return Optional.ofNullable(store.get(key));
    }

    public void add(String key, DataStructure dataStructure) {
        store.put(key, dataStructure);
    }

    public void delete(String key) {
        store.remove(key);
    }

//    public Optional<Type> type(String key) {
//        return Optional.ofNullable(store.get(key).getType());
//    }
}
