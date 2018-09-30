package com.example.nmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class PvOfAnnuityDue extends AppCompatActivity {

    EditText annuityValuePVAD, interestPVAD, yearPVAD, compoundingRatePVDA;

    TextView resultPVAD;

    Button resultPVADbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pv_of_annuity_due);

        annuityValuePVAD = findViewById(R.id.annuityValuePVAD);
        interestPVAD = findViewById(R.id.interestPVAD);
        yearPVAD = findViewById(R.id.yearPVAD);
        compoundingRatePVDA = findViewById(R.id.compoundingRatePVDA);

        resultPVAD = findViewById(R.id.resultPVAD);

        resultPVADbutton = findViewById(R.id.resultPVADbutton);


        resultPVADbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int a = Integer.parseInt(annuityValuePVAD.getText().toString());
                    double i = Double.parseDouble((interestPVAD.getText().toString()));
                    int n = Integer.parseInt(yearPVAD.getText().toString());
                    int m = Integer.parseInt(compoundingRatePVDA.getText().toString());


                    final double power = Math.pow(1 + (i / (100 * m)), (-n * m));

                    final double divide = i / (m * 100);

                    final double result = a * ((1 - power) / divide);
                    final double result2 = result * (1 + (i / (100 * m)));


                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    String result1 = decimalFormat.format(Double.valueOf(result2));

                    resultPVAD.setText(getString(R.string.w) + result1);
                } catch (Exception e) {

                    Toast.makeText(PvOfAnnuityDue.this, "Please Enter the Missing Value", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
