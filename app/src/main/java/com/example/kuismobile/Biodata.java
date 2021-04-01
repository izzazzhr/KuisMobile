package com.example.kuismobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void clickBack(View view) {
        Intent c = new Intent(Biodata.this, MainActivity.class);
        startActivity(c);
    }


    public void clickPower(View view) {
        MainActivity.logout(this);
    }

}