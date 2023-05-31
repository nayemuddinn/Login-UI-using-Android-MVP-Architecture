package com.example.loginuiusingmvppattern.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.loginuiusingmvppattern.R;

public class MainActivity extends AppCompatActivity {
     EditText userName,passWord;
     Button button;
     ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         progressBar=findViewById(R.id.Progress_bar);
         userName=findViewById(R.id.username);
         passWord=findViewById(R.id.password);
         button=findViewById(R.id.button);




    }
}