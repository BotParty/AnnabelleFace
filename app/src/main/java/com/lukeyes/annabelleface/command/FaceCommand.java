package com.lukeyes.annabelleface.command;

import com.lukeyes.annabelleface.api.ViewController;

import javax.inject.Inject;

/**
 * Created by brandon on 2/25/2017.
 */
@Command(commandText="face", parameterList="faceType:String")
public class FaceCommand extends ChatCommandBase {
    private ViewController _controller;
    @Inject
    public FaceCommand(ViewController controller) {
        _controller = controller;
    }

    @Override
    public void execute(String... parameters) {
        _controller.setImage(parameters[0]);
    }
}
