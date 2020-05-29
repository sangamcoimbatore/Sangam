package com.example.sangam.ui.web;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import com.example.sangam.R;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String url = "http://www.google.com";
        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);
    }
}
