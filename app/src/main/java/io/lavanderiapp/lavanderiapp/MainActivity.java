package io.lavanderiapp.lavanderiapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //571906809825490
//        WebView webView = (WebView) this.findViewById(R.id.webview);
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webView.loadUrl("https://chatfuel.com/bot/LavanderiApp.io");
//        webSettings.setBuiltInZoomControls(true);
//        webView.setWebViewClient(new WebViewClient());

        Button btn = (Button) findViewById(R.id.btn_chatbot);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //android.action.VIEW
                startActivity(new Intent(ACTION_VIEW, Uri.parse("fb://messaging/571906809825490")));
            }
        });

    }
}