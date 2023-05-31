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
    }

    @Override
    public int setProgressBar() {
        return 0;
    }
}
