package com.example.homan.ezmathtrainer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Incoming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incoming);
    }

    public void goHome(View view) {
        Intent home = new Intent(Incoming.this, MainActivity.class);
        home.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        home.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(home);
    }
}
