package com.example.loginuiusingmvppattern.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.loginuiusingmvppattern.Presenter.IPresenter;
import com.example.loginuiusingmvppattern.Presenter.Presenter;
import com.example.loginuiusingmvppattern.R;

public class MainActivity extends AppCompatActivity implements IView{
     EditText userEmail,passWord;
     Button button;
     ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         progressBar=findViewById(R.id.Progress_bar);
         userEmail=findViewById(R.id.usermail);
         passWord=findViewById(R.id.password);
         button=findViewById(R.id.button);

        IPresenter presenter=new Presenter(this);
        presenter.Login(userEmail.toString(),passWord.toString());






    }

    @Override
    public void LoginSuccess() {

    }

    @Override
    public void LoginFailed() {

    }
}