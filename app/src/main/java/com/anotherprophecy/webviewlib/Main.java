package com.anotherprophecy.webviewlib;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Main extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new WebViewer(this, "https://x-raiders.net", "my-useragent");
    }
}
