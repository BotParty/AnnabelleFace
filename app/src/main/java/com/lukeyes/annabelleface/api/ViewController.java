package com.lukeyes.annabelleface.api;

import java.io.DataInput;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by brandon on 2/12/2017.
 */

public interface ViewController {
    void setImage(String image);

    void setEyeState(String eyeState);

    void talk(boolean talkOn);

    void setUri(String uriStr);
}
