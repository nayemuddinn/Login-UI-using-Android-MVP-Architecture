package com.example.loginuiusingmvppattern.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.loginuiusingmvppattern.Presenter.IPresenter;
import com.example.loginuiusingmvppattern.Presenter.Presenter;
import com.example.loginuiusingmvppattern.R;

public class MainActivity extends AppCompatActivity implements IView {
    EditText userEmail, passWord;
    Button button;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.Progress_bar);
        userEmail = findViewById(R.id.usermail);
        passWord = findViewById(R.id.password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IPresenter presenter = new Presenter(MainActivity.this);
                presenter.Login(userEmail.toString(), passWord.toString());
            }
        });



    }

    @Override
    public void LoginSuccess(String msg) {
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginFailed(String msg) {
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}