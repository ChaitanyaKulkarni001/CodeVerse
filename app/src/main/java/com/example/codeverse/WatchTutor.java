package com.example.codeverse;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WatchTutor extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_tutorials);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        String courseName = getIntent().getStringExtra("COURSE_NAME");
        String url = getCourseURL(courseName);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

    private String getCourseURL(String courseName) {
        switch (courseName) {
            case "C":
                Toast.makeText(this, "Please wait...", Toast.LENGTH_SHORT).show();
                return "https://www.youtube.com/embed/ZSPZob_1TOk";
            case "C++":
                Toast.makeText(this, "Please wait...", Toast.LENGTH_SHORT).show();
                return "https://www.youtube.com/embed/videoseries?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL";
            case "Java":
                Toast.makeText(this, "Please wait...", Toast.LENGTH_SHORT).show();
                return "https://www.youtube.com/embed/videoseries?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q";
            case "Python":
                Toast.makeText(this, "Please wait...", Toast.LENGTH_SHORT).show();
                return "https://www.youtube.com/embed/qHJjMvHLJdg";
            default:
                Toast.makeText(this, "Please  connect to internet", Toast.LENGTH_SHORT).show();
                return "https://www.youtube.com";
        }
    }
}
