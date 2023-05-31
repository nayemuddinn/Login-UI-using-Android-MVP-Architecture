package com.example.loginuiusingmvppattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText userName,passWord;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         userName=findViewById(R.id.username);
         passWord=findViewById(R.id.password);
         button=findViewById(R.id.button);




    }
}