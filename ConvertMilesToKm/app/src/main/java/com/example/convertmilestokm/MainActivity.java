package com.example.convertmilestokm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button milesToKms = (Button)findViewById(R.id.buttonConvMilesToKm);
        milesToKms.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText milesText = (EditText) findViewById(R.id.editTextMiles);
                EditText kmsText = (EditText) findViewById(R.id.editTextKm);
                if ( !milesText.getText().toString().isEmpty() ) {
                    double vMiles = Double.valueOf(milesText.getText().toString());
                    double vKm = vMiles / 0.62137;
                    DecimalFormat format = new DecimalFormat("0.00");
                    kmsText.setText(format.format(vKm));
                }
            }
        });

        Button kmsToMiles = (Button)findViewById(R.id.buttonConvKmToMiles);
        kmsToMiles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText milesText = (EditText) findViewById(R.id.editTextMiles);
                EditText kmsText = (EditText) findViewById(R.id.editTextKm);
                if ( !kmsText.getText().toString().isEmpty() ) {
                    double vKm = Double.valueOf(kmsText.getText().toString());
                    double vMiles = vKm * 0.62137;
                    DecimalFormat format = new DecimalFormat("0.00");
                    milesText.setText(format.format(vMiles));
                }
            }
        });
    }
}