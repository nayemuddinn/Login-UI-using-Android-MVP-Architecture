package com.example.loginuiusingmvppattern.Presenter;

import com.example.loginuiusingmvppattern.Model.IUser;
import com.example.loginuiusingmvppattern.Model.User;
import com.example.loginuiusingmvppattern.View.IView;

public class Presenter implements IPresenter{

    IView iView;

    public Presenter(IView iView) {
        this.iView = iView;
    }

    @Override
    public void Login(String email, String password) {
        User user=new User(email,password);
        int login_code=user.checkValidty(email,password);

        if(login_code==-1)
            iView.LoginFailed("Enter a email");
        if(login_code==-2)
            iView.LoginFailed("Enter a valid Email");
        if(login_code==-3)
            iView.LoginFailed("Password have to be greater than 6 character");
        else
            iView.LoginSuccess("Login Success");
    }

    @Override
    public int setProgressBar() {
        return 0;
    }
}
