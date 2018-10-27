package com.example.sereg.taxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class CreateTrip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_trip);
    }


    public void onButtonClick(View v){
        EditText name = (EditText)findViewById(R.id.Name);
        EditText address = (EditText)findViewById(R.id.Address);
        EditText time = (EditText)findViewById(R.id.Time);
    }
}
