package com.example.codeverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class CourseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        // Get course name from Intent
        String courseName = getIntent().getStringExtra("COURSE_NAME");
        TextView courseTitle = findViewById(R.id.courseTitle);

        if (Objects.equals(courseName, "C")) {
            Toast.makeText(this, "Just a Second", Toast.LENGTH_SHORT).show();
            courseTitle.setText("C Programming");
        } else if (Objects.equals(courseName, "C++")) {
            Toast.makeText(this, "Loading ...", Toast.LENGTH_SHORT).show();
            courseTitle.setText("C++");
        } else if (Objects.equals(courseName, "Java")) {
            Toast.makeText(this, "Just a Second", Toast.LENGTH_SHORT).show();
            courseTitle.setText("Java");
        } else {
            Toast.makeText(this, "Loading ...", Toast.LENGTH_SHORT).show();
            courseTitle.setText("Python");
        }

        // Handle ViewNotes button click
        LinearLayout viewNotes = findViewById(R.id.ViewNotes);
        viewNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseActivity.this, ViewNotes.class);
                intent.putExtra("COURSE_NAME", courseName);
                startActivity(intent);
            }
        });

//        TextView WatchTutor = findViewById(R.id.WatchTutorials);

        LinearLayout watchTutorials = findViewById(R.id.WatchTutorials);
        watchTutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseActivity.this, WatchTutor.class);
                intent.putExtra("COURSE_NAME", courseName);
                startActivity(intent);
            }
        });
        // Handle Practise Problem button
        LinearLayout practiseProblems = findViewById(R.id.practiceButton);
        practiseProblems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseActivity.this, PractiseProblems.class);
                intent.putExtra("COURSE_NAME", courseName);
                startActivity(intent);
            }
        });
        LinearLayout takeQuiz = findViewById(R.id.quizButton);
        takeQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseActivity.this, TakeQuiz.class);
                intent.putExtra("COURSE_NAME", courseName);
                startActivity(intent);
            }
        });
    }
}
