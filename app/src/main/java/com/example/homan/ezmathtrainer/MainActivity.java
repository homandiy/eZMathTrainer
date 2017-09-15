package com.example.homan.ezmathtrainer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    RadioGroup radioMax;
    RadioGroup radioTimer;

    SoundEffects vPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);

        radioMax = (RadioGroup) findViewById(R.id.radioMaxNumber);
        radioTimer = (RadioGroup) findViewById(R.id.radioTimer);

        vPlay = new SoundEffects(this);
        Log.i("tms myContext", this.toString());

    }


    public void additionTrainerOption(View view) {

        //play tata
        vPlay = new SoundEffects(this);
        vPlay.backgroundMusic("Have Fun");
        vPlay.playSoundEffect("tata");

        //redirect to addition trainer
        Intent additionTrainer = new Intent(MainActivity.this, AdditionTrainer.class);

        /*
        //Create the bundle
        Bundle bundle = new Bundle();

        //Add test range and time limit to bundle
        bundle.putString("maxTestNumber", (String)radioMax.getTag() );
        bundle.putString("timeLimit", (String)radioTimer.getTag() );

        //Add the bundle to the addition trainer activity
        additionTrainer.putExtras(bundle);
        */

        startActivity(additionTrainer);
    }

    //goto incoming
    public void incomingPage(View view) {
        //redirect to incoming page
        Intent incoming = new Intent(MainActivity.this, Incoming.class);
        incoming.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        incoming.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(incoming);
    }
}
