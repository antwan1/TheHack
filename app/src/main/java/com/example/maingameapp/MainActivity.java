package com.example.maingameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv_card_left, iv_card_right;
    TextView tv_score_left, tv_score_right;
    Button Button5;
    Random r;
    int leftScore = 0, rightScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_card_left = (ImageView) findViewById(R.id.iv_card_left);
        iv_card_right = (ImageView) findViewById(R.id.iv_card_right);
        tv_score_left = (TextView) findViewById(R.id.tv_score_left);
        tv_score_right = (TextView) findViewById(R.id.tv_score_right);
        Button5 = (Button) findViewById(R.id.Button5);
        r= new Random();

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //generate two card numbers
                int leftCard = r.nextInt(13) + 2; //This is card from 2 - 14
                int rightCard = r.nextInt(13) + 2; //This is card from 2 - 14
                //show card images
                int leftImage = getResources().getIdentifier("card" + leftCard,"drawable",getPackageName());
                iv_card_left.setImageResource(leftImage);

                int rightImage = getResources().getIdentifier("card" + rightCard,"drawable",getPackageName());
                iv_card_right.setImageResource(rightImage);
                //compare cards, add points and display them
                if(leftCard > rightCard){
                    leftScore++;
                    tv_score_left.setText(String.valueOf(leftScore));

                }else if (leftCard < rightCard){
                    rightScore++;
                    tv_score_right.setText(String.valueOf(rightScore));


                }else{
                    Toast.makeText(MainActivity.this,"GO!", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}