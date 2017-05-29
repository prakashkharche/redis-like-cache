package com.kodergeek.commands.string;

import com.kodergeek.commands.Command;
import com.kodergeek.datastore.DataStore;
import com.kodergeek.datastore.ds.DataStructure;

import java.util.Optional;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class GetCommand extends Command{
    private String key;
    public GetCommand(String key, DataStore dataStore) {
        super(dataStore);
        this.key = key;
    }

    @Override
    public void execute() {
        Optional<DataStructure> dataStructure = dataStore.get(key);
        if (!dataStructure.isPresent()) {
            System.out.println("Key "+key+ " is not present.!!");
            return;
        }
        System.out.println(dataStructure.get().getValue());
    }
}
