package com.example.user.myapplicatiom;

/**
 * Created by User on 2016/07/24.
 */
public class user {
    String name , email , pass;
    public user (String name ,String email , String pass)
    {
        this.name= name;
        this.email=email;
        this.pass= pass;
    }

    public user (String email , String pass)
    {
        this.email = email;
        this.pass = pass;
        this.name = "";
    }
}
