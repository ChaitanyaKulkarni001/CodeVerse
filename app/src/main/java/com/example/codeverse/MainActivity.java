package com.example.codeverse;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {


//private CardView cButton, cppButton, javaButton, pythonButton;  // Change Button to CardView
    private TextView welcomeText;
    private CardView cButton, cppButton, javaButton, pythonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Connects to activity_main.xml

        // Initialize UI components
        welcomeText = findViewById(R.id.welcomeText);
        cButton = findViewById(R.id.cButton);
        cppButton = findViewById(R.id.cppButton);
        javaButton = findViewById(R.id.javaButton);
        pythonButton = findViewById(R.id.pythonButton);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        cButton.setOnClickListener(v -> openCourse("C"));
        cppButton.setOnClickListener(v -> openCourse("C++"));
        javaButton.setOnClickListener(v -> openCourse("Java"));
        pythonButton.setOnClickListener(v -> openCourse("Python"));




        // Get user's name from Intent
        String userName = getIntent().getStringExtra("USER_NAME");
//        String userName = "ABC";
        if (userName != null) {
            welcomeText.setText("Welcome, " + userName + "!");
        }


    }

    // Function to handle button clicks
    private void openCourse(String courseName) {
        System.out.println("Oopening "+courseName);
        Toast.makeText(this, "Cliked on"+courseName, Toast.LENGTH_SHORT).show();
//        if (courseName == "C" ){
            Intent intent = new Intent(this, CourseActivity.class);
        intent.putExtra("COURSE_NAME", courseName);
        startActivity(intent);
//        }
//        Intent intent = new Intent(this, CourseActivity.class);
//        intent.putExtra("COURSE_NAME", courseName);
//        startActivity(intent);
    }
}
