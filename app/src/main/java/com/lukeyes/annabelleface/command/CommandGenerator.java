package com.lukeyes.annabelleface.command;


import java.lang.reflect.Constructor;
import java.util.Arrays;


/**
 * Created by brandon on 2/20/2017.
 */


public class CommandGenerator {

    private final CommandReference _lookup;

    public CommandGenerator () {_lookup = new CommandLookup();}

    public CommandGenerator (CommandReference lookup) {
        _lookup = lookup;
    }
    public  ChatCommand generate(String verb, String... parameters) throws Exception {
        Class cmdClass =  _lookup.getCommand(verb.toLowerCase());
        if (cmdClass == null) throw new Exception("Unknown command");

        Class<?>[] types = new Class<?>[parameters.length];
        Arrays.fill(types,String.class);

        Constructor<?> ctor = cmdClass.getConstructor(types);
        return (ChatCommand) ctor.newInstance((Object[]) parameters);
    }
}

