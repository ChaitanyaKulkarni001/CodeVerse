package com.example.codeverse;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ViewNotes extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_notes);

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
                Toast.makeText(this, "Please wait while loading ...", Toast.LENGTH_SHORT).show();
                return "https://docs.google.com/gview?embedded=true&url=https://www.vssut.ac.in/lecture_notes/lecture1424354156.pdf";
            case "C++":
                Toast.makeText(this, "Please wait while loading ...", Toast.LENGTH_SHORT).show();
                return "https://drive.google.com/file/d/0B4FvMgXYrsyANHp6VGhwYldQTVU/view?resourcekey=0-atzZq8eX2s2EWPgqNd_iEA";
            case "Java":
                Toast.makeText(this, "Please wait while loading ...", Toast.LENGTH_SHORT).show();
                return "https://drive.google.com/file/d/1TQwa6iLSPJyyvmimugZ4Nizc7qjc0psw/edit";
            case "Python":
                Toast.makeText(this, "Please wait while loading ...", Toast.LENGTH_SHORT).show();
                return "https://docs.google.com/gview?embedded=true&url=https://mrcet.com/downloads/digital_notes/CSE/III%20Year/PYTHON%20PROGRAMMING%20NOTES.pdf";
            default:
                Toast.makeText(this, "No Internet Connection !", Toast.LENGTH_SHORT).show();
                return "https://www.google.com";
        }
    }
}
