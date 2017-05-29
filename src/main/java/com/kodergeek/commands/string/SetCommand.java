package com.kodergeek.commands.string;

import com.kodergeek.commands.Command;
import com.kodergeek.datastore.DataStore;
import com.kodergeek.datastore.ds.StringDS;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class SetCommand extends Command{
    private String key;
    private String value;
    public SetCommand(String key, String value, DataStore dataStore) {
        super(dataStore);
        this.key = key;
        this.value = value;
    }

    @Override
    public void execute() {
        dataStore.add(key, new StringDS(value));
        System.out.println("Key "+key+" set to "+value);
    }
}
