package com.example.loginuiusingmvppattern.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {

     String email;
     String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int checkValidty(String email,String password) {

        if(!TextUtils.isEmpty(email))
            return -1;
        else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return -2;
        else if(password.length()<6)
            return -3;
        else
            return 1;
    }
}
