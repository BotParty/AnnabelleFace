package com.lukeyes.annabelleface.command;

import org.reflections.Reflections;

import java.util.HashMap;

/**
 * Created by brandon on 2/20/2017.
 */


public class CommandLookup implements CommandReference {

    private HashMap<String,Class> lookup = new HashMap<>();

    protected CommandLookup() {
        Reflections ref = new Reflections();
        for (Class clazz : ref.getSubTypesOf(ChatCommandBase.class)) {
            String commandName = "";
            Command annotation = ChatCommandBase.getCommandAnnotation(clazz);
            if (annotation != null) {
                commandName = annotation.commandText();
            } else {
                commandName = ChatCommandBase.getConventionalCommandName(clazz);
            }
            lookup.put(commandName,clazz);
        }
    }

    @Override
    public Class getCommand(String cmd) {
        if (lookup.containsKey(cmd)) return lookup.get(cmd);
        return null;
    }


}