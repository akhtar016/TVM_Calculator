package com.example.nmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class PerpetualAnnuity extends AppCompatActivity {

    EditText annuityValuePerpetual, interestPerpetual;
    TextView resultPerpetual;
    Button resultPerpetualButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpetual_annuity);

        annuityValuePerpetual = findViewById(R.id.annuityValuePerpetual);
        interestPerpetual = findViewById(R.id.interestPerpetual);

        resultPerpetual = findViewById(R.id.resultPerpetual);
        resultPerpetualButton = findViewById(R.id.resultPerpetualButton);


        resultPerpetualButton.setOnClickListener(new View.OnClickListener() {
                                                     @Override
                                                     public void onClick(View v) {

                                                         try {
                                                             int a = Integer.parseInt(annuityValuePerpetual.getText().toString());
                                                             double i = Double.parseDouble((interestPerpetual.getText().toString()));


                                                             final double result = (a / (i / 100));
                                                             DecimalFormat decimalFormat = new DecimalFormat("0.00");
                                                             String result1 = decimalFormat.format(Double.valueOf(result));


                                                             resultPerpetual.setText(getString(R.string.p) + result1);
                                                         } catch (Exception e) {


                                                             Toast.makeText(PerpetualAnnuity.this, "Please Enter Missing Value", Toast.LENGTH_SHORT).show();
                                                         }
                                                     }


                                                 }
        );


    }
}
