package com.kodergeek.commands.list;

import com.kodergeek.commands.Command;
import com.kodergeek.datastore.DataStore;
import com.kodergeek.datastore.ds.DataStructure;

import java.util.Optional;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class LgetAllCommand extends Command{
    private String key;

    public LgetAllCommand(String key, DataStore dataStore) {
        super(dataStore);
        this.key = key;
    }

    @Override
    public void execute() {
        Optional<DataStructure> dataStructureOptional = dataStore.get(key);
        if (!dataStructureOptional.isPresent()) {
            System.out.println("Key "+key+ " not present.!!");
            return;
        }
        DataStructure dataStructure = dataStructureOptional.get();
        System.out.println(dataStructure.getValue());
    }
}
