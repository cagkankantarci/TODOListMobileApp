package com.example.forev.huaweitodolist.Utils;

import android.app.Activity;
import android.content.SharedPreferences;

public class GetSharedPreferences {
    private SharedPreferences sharedPreferences;
    private Activity activity;

    public GetSharedPreferences(Activity activity){
        this.activity =activity;
    }

    public SharedPreferences getSession()
    {
        sharedPreferences = activity.getApplicationContext().getSharedPreferences("session",0);
        return sharedPreferences;
    }

    public void setSession(String id,String username,String email)
    {
        sharedPreferences = activity.getApplicationContext().getSharedPreferences("session",0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("id",id);
        editor.putString("username",username);
        editor.putString("email",email);
        editor.commit();
    }

    public void deleteToSession()
    {
        sharedPreferences = activity.getApplicationContext().getSharedPreferences("session",0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }
}
