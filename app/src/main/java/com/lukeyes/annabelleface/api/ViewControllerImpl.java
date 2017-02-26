package com.lukeyes.annabelleface.api;

import android.webkit.WebView;

/**
 * Created by brandon on 2/25/2017.
 */

public class ViewControllerImpl implements ViewController {

    private  WebView _webView;
    private final String BASE_FACE_URL = "file:///android_asset/face/";
    private final String FACE_URL = BASE_FACE_URL + "index.html?"

    public void setWebView(WebView webView) {
        _webView = webView;
    }
    @Override
    public void setImage(String image) {

        _webView.loadUrl("file:///android_asset/face/index.html?cycle=");
    }
}
