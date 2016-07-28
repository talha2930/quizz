package com.example.user.myapplicatiom;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by User on 2016/07/24.
 */
public class UserLocalStore {

    public static final String SP_NAME ="user details";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context)
    {
        userLocalDatabase = context.getSharedPreferences(SP_NAME , 0);
    }

    public void storeUserData(user use)
    {
      SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name" , use.name);
        spEditor.putString("email" , use.email);
        spEditor.putString("pass" , use.pass);
        spEditor.commit();

    }
    public user getLoggedInUser ()
    {
        String name = userLocalDatabase.getString("name", "");
        String email = userLocalDatabase.getString("email" , "");
        String pass = userLocalDatabase.getString("pass" , "");

        user storedUser = new user(name , email , pass);
        return storedUser;

    }

    public void setUserLoggedIn (boolean loggedIn)
    {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn" , loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn()
    {
        if ( userLocalDatabase.getBoolean("loggedIn", false)== true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void clearUserData ()
    {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
