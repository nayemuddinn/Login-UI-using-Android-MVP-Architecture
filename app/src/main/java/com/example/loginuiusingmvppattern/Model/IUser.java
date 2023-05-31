package com.example.loginuiusingmvppattern.Model;

public interface IUser {
    String getEmail();
    String getPassword();
    int checkValidty(String email,String password);
}
