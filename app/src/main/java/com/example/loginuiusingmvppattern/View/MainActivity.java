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
   private EditText userEmail, passWord;
   private Button button;
   private ProgressBar progressBar;
    private IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.Progress_bar);
        userEmail = findViewById(R.id.usermail);
        passWord = findViewById(R.id.password);
        button = findViewById(R.id.button);


        presenter = new Presenter(this);
        progressBar.setVisibility(View.INVISIBLE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressBar.setVisibility(View.VISIBLE);
                presenter.Login(userEmail.getText().toString().trim(), passWord.getText().toString().trim());

                userEmail.setText("");
                passWord.setText("");

            }
        });



    }

    @Override
    public void LoginSuccess(String msg) {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginFailed(String msg) {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }


}