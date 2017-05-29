package com.kodergeek.commands;

import com.kodergeek.commands.list.LaddCommnad;
import com.kodergeek.commands.list.LgetAllCommand;
import com.kodergeek.commands.list.LsetCommand;
import com.kodergeek.commands.string.GetCommand;
import com.kodergeek.commands.string.SetCommand;
import com.kodergeek.datastore.DataStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by prakash.vijay on 28/05/17.
 */
public class CommandFactory {
    private DataStore dataStore;

    public CommandFactory(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    //ToDo: need to add validate methods
    public Optional<Command> getCommand(String instruction) {
        String[] commandWithArgs = instruction.split(" ");
        switch (commandWithArgs[0]) {
            case Commands.GET :
                String key = commandWithArgs[1];
                return Optional.of(new GetCommand(key, dataStore));
            case Commands.SET :
                key = commandWithArgs[1];
                String value = commandWithArgs[2];
                return Optional.of(new SetCommand(key, value, dataStore));
            case Commands.LSET :
                key = commandWithArgs[1];
                List<String> values = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(commandWithArgs, 2, commandWithArgs.length)));
                return Optional.of(new LsetCommand(key, values, dataStore));
            case Commands.LADD :
                key = commandWithArgs[1];
                value = commandWithArgs[2];
                return Optional.of(new LaddCommnad(key, value, dataStore));
            case Commands.LGETALL :
                key = commandWithArgs[1];
                return Optional.of(new LgetAllCommand(key, dataStore));
            default: System.out.println("Invalid command.!!");
        }
        return Optional.empty();
    }
}
