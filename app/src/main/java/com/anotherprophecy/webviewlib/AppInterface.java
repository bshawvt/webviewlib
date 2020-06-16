package com.anotherprophecy.webviewlib;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class AppInterface {
    Context context;
    public AppInterface(Context context) {
        this.context = context;
    }
    @JavascriptInterface
    public void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
