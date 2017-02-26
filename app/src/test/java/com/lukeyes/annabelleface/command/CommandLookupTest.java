package com.lukeyes.annabelleface.command;

import com.lukeyes.annabelleface.command.CommandLookup;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by brandon on 2/25/2017.
 */

public class CommandLookupTest{
    @Test
    public void lookupTest() throws Exception{
        CommandLookup lookup = new CommandLookup();
        Class cmdClass = lookup.getCommand("say");
        assertEquals(SayCommand.class,cmdClass);
    }
}
