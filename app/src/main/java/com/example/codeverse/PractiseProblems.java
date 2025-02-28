package com.example.codeverse;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PractiseProblems extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise_problems); // Ensure this XML exists!

        webView = findViewById(R.id.webView); // Make sure webView exists in XML
        webView.setWebViewClient(new WebViewClient());

        String courseName = getIntent().getStringExtra("COURSE_NAME");
        String url = getCourseURL(courseName);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

    private String getCourseURL(String courseName) {
        switch (courseName) {
            case "C":
                Toast.makeText(this, "Loading content ...", Toast.LENGTH_SHORT).show();
                return "https://www.geeksforgeeks.org/c-exercises/";
            case "C++":
                Toast.makeText(this, "Loading content ...", Toast.LENGTH_SHORT).show();
                return "https://www.geeksforgeeks.org/cpp-exercises/";
            case "Java":
                Toast.makeText(this, "Loading content ...", Toast.LENGTH_SHORT).show();
                return "https://www.geeksforgeeks.org/java-exercises/";
            case "Python":
                Toast.makeText(this, "Loading content ...", Toast.LENGTH_SHORT).show();
                return "https://www.geeksforgeeks.org/python-exercises-practice-questions-and-solutions/";
            default:
                Toast.makeText(this, "Please connect to the internet", Toast.LENGTH_SHORT).show();
                return "https://www.youtube.com";
        }
    }
}
