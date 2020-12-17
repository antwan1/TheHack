package com.selfmade.a1up;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Game {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playGame(View v){
        Intent i = new Intent(this, Game.class);
        startActivity(i);
    }
    public void loginPage(View v){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
    public void settingPage(View v){
        Intent i = new Intent(this, Setting.class);
        startActivity(i);
    }
}