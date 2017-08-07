package com.example.adarsh.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button)findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView)findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView)findViewById(R.id.image_rightDice);

        final int[] diceArray = {R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};

        final Toast myToast = new Toast(this);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                int number1 = randomGenerator.nextInt(6);
                leftDice.setImageResource(diceArray[number1]);

                int number2 = randomGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number2]);

                if(number1==number2){
                    myToast.makeText(MainActivity.this,"Congrats!, Match Found",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
