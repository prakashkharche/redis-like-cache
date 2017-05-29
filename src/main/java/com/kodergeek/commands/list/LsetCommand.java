package com.kodergeek.commands.list;

import com.kodergeek.commands.Command;
import com.kodergeek.datastore.DataStore;
import com.kodergeek.datastore.ds.ListDS;

import java.util.List;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class LsetCommand extends Command{
    private String key;
    private List<String> value;

    public LsetCommand(String key, List<String> value, DataStore dataStore) {
        super(dataStore);
        this.key = key;
        this.value = value;
    }

    @Override
    public void execute() {
        dataStore.add(key, new ListDS(value));
        System.out.println("Values "+value+" addded to key "+key);
    }
}
