package com.kodergeek.commands.list;

import com.kodergeek.commands.Command;
import com.kodergeek.datastore.DataStore;
import com.kodergeek.datastore.ds.DataStructure;
import com.kodergeek.datastore.ds.Type;

import java.util.List;
import java.util.Optional;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class LaddCommnad extends Command{
    private String key;
    private String value;

    public LaddCommnad(String key, String value, DataStore dataStore) {
        super(dataStore);
        this.key = key;
        this.value = value;
    }

    @Override
    public void execute() {
        Optional<DataStructure> dataStructureOptional = dataStore.get(key);
        if (!dataStructureOptional.isPresent()) {
            System.out.println("Key "+key+ " doesnot exists.!!");
            return;
        }
        DataStructure dataStructure = dataStructureOptional.get();
        if (dataStructure.getType() != Type.LIST) {
            System.out.println("Error : Incorrect data type");
            return;
        }
        List<String> values = (List<String>) dataStructure.getValue();
        values.add(value);
        System.out.println("Value "+value+ " added for key "+key);
    }
}
