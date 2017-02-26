package com.lukeyes.annabelleface.command;

/**
 * Created by brandon on 2/25/2017.
 */

@Command(commandText="pause",parameterList={"timeMs:int"})
public class PauseCommand extends ChatCommandBase {

    public void execute(String... parameters) {
        try {
            int time = int.parseInt(parameters[0]);
            //putting this in to prevent oopsies
            if (time < 20000) {
                wait(time);
            }
        }
        catch (Exception e){}
    }
}