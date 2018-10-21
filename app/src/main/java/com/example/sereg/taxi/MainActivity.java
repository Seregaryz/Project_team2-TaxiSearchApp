package com.example.sereg.taxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent intent = new Intent("com.example.sereg.taxi.ActualTrips");
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.button1:
                Intent intent = new Intent("com.example.sereg.taxi.CreateTrip" );
                startActivity(intent);
                break;
            default:
                break;
        }

    }

}