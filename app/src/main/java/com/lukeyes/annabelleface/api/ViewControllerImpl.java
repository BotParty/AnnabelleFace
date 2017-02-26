package com.lukeyes.annabelleface.api;

import com.lukeyes.annabelleface.FullscreenActivity;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.inject.Inject;

/**
 * Created by brandon on 2/25/2017.
 */

public class ViewControllerImpl implements ViewController {

    private FullscreenActivity _activity;
    private final String BASE_FACE_URL = "file:///android_asset/face/";
    private final String FACE_URI = "index.html?face=%s";


    @Inject
    public ViewControllerImpl(FullscreenActivity activity) {
        _activity = activity;
    }

    @Override
    public void setImage(String image) {

        _activity.getWebView().loadUrl(String.format(FACE_URI,image));
    }

    @Override
    public void setUri(String uriStr) {
        URL url;
        try {
            URI uri = new URI(uriStr);
            if (!uri.isAbsolute()) {
                url = new URL(new URL(BASE_FACE_URL), uri.toString());
            } else url = uri.toURL();
        }
        catch (MalformedURLException | URISyntaxException ex) {
            ex.printStackTrace();
            return;
        }
        _activity.getWebView().loadUrl(url.toString());
    }
}
