package com.example.nmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class PresentValue extends AppCompatActivity {


    EditText futureValue, interest, numberOfYear, compoundingRate;
    TextView presentValueResult;

    Button resultPresentButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_value);




        futureValue = findViewById(R.id.futureValue);
        interest = findViewById(R.id.interest);
        numberOfYear = findViewById(R.id.year);
        compoundingRate = findViewById(R.id.compoundingRate);


        presentValueResult = findViewById(R.id.presentValueResult);

        resultPresentButton = findViewById(R.id.resultPresentButton);


        resultPresentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int futureValue1 = Integer.parseInt(futureValue.getText().toString());
                    double interestRate = Double.parseDouble((interest.getText().toString()));
                    int numberOfYear1 = Integer.parseInt(numberOfYear.getText().toString());
                    int compoundRate = Integer.parseInt(compoundingRate.getText().toString());


                    final double result = futureValue1 / Math.pow(1 + (interestRate / (100 * compoundRate)), (numberOfYear1 * compoundRate));


                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    String result1 = decimalFormat.format(Double.valueOf(result));

                    presentValueResult.setText(getString(R.string.re) + result1);
                }
                catch (Exception e){


                    presentValueResult.setText("");
                    Toast.makeText(PresentValue.this, "Please Enter The Missing Value", Toast.LENGTH_LONG).show();
                }

















            }
        });










    }
}
