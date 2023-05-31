package com.example.loginuiusingmvppattern.Presenter;

import android.os.Handler;
import android.os.Looper;

import com.example.loginuiusingmvppattern.Model.IUser;
import com.example.loginuiusingmvppattern.Model.User;
import com.example.loginuiusingmvppattern.View.IView;

import kotlin.reflect.KVisibility;


public class Presenter implements IPresenter{

    IView iView;
    private Handler handler;

    public Presenter(IView iView) {
        this.iView = iView;
        handler=new Handler(Looper.getMainLooper());
    }

    @Override
    public void Login(String email, String password) {
        User user=new User(email,password);
        int login_code=user.checkValidty();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(login_code==0){
                    iView.LoginFailed("Enter credential");}
                else if(login_code==-2){
                    iView.LoginFailed("Enter a valid Email");}
                else if(login_code==-3) {
                    iView.LoginFailed("Password have to be greater than 6 character");
                }else {
                    iView.LoginSuccess("Login Success");
                }
            }
        },1800);

    }


}
