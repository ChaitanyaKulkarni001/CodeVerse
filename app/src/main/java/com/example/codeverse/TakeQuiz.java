package com.example.codeverse;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TakeQuiz extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takequiz); // Ensure this XML exists!

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
                return "https://www.w3schools.com/quiztest/quiztest.php?qtest=C";
            case "C++":
                Toast.makeText(this, "Loading content ...", Toast.LENGTH_SHORT).show();
                return "https://www.w3schools.com/quiztest/quiztest.asp?qtest=CPP";
            case "Java":
                Toast.makeText(this, "Loading content ...", Toast.LENGTH_SHORT).show();
                return "https://www.w3schools.com/quiztest/quiztest.asp?qtest=JAVA";
            case "Python":
                Toast.makeText(this, "Loading content ...", Toast.LENGTH_SHORT).show();
                return "https://www.w3schools.com/quiztest/quiztest.asp?qtest=PYTHON";
            default:
                Toast.makeText(this, "Please connect to the internet", Toast.LENGTH_SHORT).show();
                return "https://www.youtube.com";
        }
    }
}
