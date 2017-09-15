package com.example.homan.ezmathtrainer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AdditionTrainer extends AppCompatActivity {


    int maxTestNumber;
    int timeLimit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_trainer);

        //Get the bundle
        //Bundle bundle = getIntent().getExtras();

        //maxTestNumber = Integer.valueOf( bundle.getString("maxTestNumber") );
        //timeLimit = Integer.valueOf( bundle.getString("timeLimit") );

        //Toast.makeText(this, "Max Range: " + String.valueOf(maxTestNumber) + ", time limit: " + String.valueOf(timeLimit), Toast.LENGTH_LONG).show();

    }
}
