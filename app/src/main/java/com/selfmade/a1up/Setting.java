package com.selfmade.a1up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_page);
    }
    public void menu(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}