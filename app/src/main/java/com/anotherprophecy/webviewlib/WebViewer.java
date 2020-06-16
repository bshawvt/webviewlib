package com.anotherprophecy.webviewlib;

import android.app.Activity;
import android.webkit.WebView;

public class WebViewer {
    public WebViewer(Activity activity, String assetOrURL, String useragent) {
        WebView web = new WebView(activity);
        web.setWebViewClient(new MyWebViewClient());
        web.setWebChromeClient(new MyWebChromeClient());
        web.getSettings().setJavaScriptEnabled(true);
        if (useragent.length() > 0)
            web.getSettings().setUserAgentString(useragent);
        web.setScrollBarStyle(web.SCROLLBARS_OUTSIDE_OVERLAY);
        web.loadUrl(assetOrURL);//"http://test.anotherprophecy.com/android/index.html"); // "file:///android_asset/index.html");
        web.addJavascriptInterface(new AppInterface(activity.getApplicationContext()), "AppInterface" );
        activity.setContentView(web);
    }
}
