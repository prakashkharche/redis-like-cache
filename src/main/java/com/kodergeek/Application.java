package com.kodergeek;

import com.kodergeek.commands.Command;
import com.kodergeek.commands.CommandFactory;
import com.kodergeek.commands.Commands;
import com.kodergeek.commands.string.GetCommand;
import com.kodergeek.commands.string.SetCommand;
import com.kodergeek.datastore.DataStore;
import com.kodergeek.datastore.HashMapDataStore;

import java.util.Optional;
import java.util.Scanner;

/**
 * Created by prakash.vijay on 27/05/17.
 */
public class Application {
    private static CommandFactory commandFactory;

    public static void main(String[] args) {
        init();
        Scanner scanner =  new Scanner(System.in);
        while (true) {
            String instruction = scanner.nextLine();
            Optional<Command> commandOptional = commandFactory.getCommand(instruction);
            if (!commandOptional.isPresent()) {
                System.out.println("Command not found.!!");
                continue;
            }
            commandOptional.get().execute();
        }
    }

    public static void init() {
        commandFactory = new CommandFactory(new HashMapDataStore());
    }
}
