package com.kodergeek.commands;

import com.kodergeek.datastore.DataStore;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public abstract class Command {
    protected DataStore dataStore;

    public Command(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void execute();
}
