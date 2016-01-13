package com.intfocus.yh_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SubjectActivity extends Activity {

    private TextView mTitle;
    private ImageView mComment;
    private WebView mWebView;

    private View.OnClickListener mOnBackListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SubjectActivity.this.onBackPressed();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        findViewById(R.id.back).setOnClickListener(mOnBackListener);
        findViewById(R.id.back_text).setOnClickListener(mOnBackListener);

        mTitle = (TextView) findViewById(R.id.title);
        mComment = (ImageView) findViewById(R.id.comment);
        mWebView = (WebView) findViewById(R.id.webview);

        mWebView.initialize();
        mWebView.loadUrl("http://www.baidu.com");

        mComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity.this, ObjectActivity.class);
                SubjectActivity.this.startActivity(intent);
            }
        });
    }
}
