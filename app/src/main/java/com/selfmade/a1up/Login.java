package com.selfmade.a1up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //Button loginButton;
    //TextView player1Name;
    //EditText playerEnterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //this.loginButton = findViewById(R.id.loginButton);
        //this.playerEnterName = findViewById(R.id.PersonName);

        /*
         * this is the action listen for the button,
         * whenever the button gets clicked it 'listens'
         * and then performs anything that is inside the method,
         * in this case its showText
         * */
        /*loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = playerEnterName.getText().toString();
                player1Name.setText("Player :" + name);
            }
        });

        player1Name = findViewById(R.id.textView);

        loginButton.setText("Login");*/


    }

    public void login(View v){
        Intent i = new Intent(this, Game.class);
        startActivity(i);

        EditText p1 =  findViewById(R.id.PersonName);
        String input = p1.getText().toString();
        ((TextView)findViewById(R.id.player1Name)).setText(input);
        Toast.makeText(this,"Welcome " + input, Toast.LENGTH_SHORT).show();
    }

}