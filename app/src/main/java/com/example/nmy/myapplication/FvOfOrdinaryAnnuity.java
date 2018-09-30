package com.example.nmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FvOfOrdinaryAnnuity extends AppCompatActivity {


    EditText annuityValueFVOA, interestFVOA, yearFVOA, compoundingRateFOVA;

    TextView resultFVOA;

    Button resultFVOAbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fv_of_ordinary_annuity);

        annuityValueFVOA = findViewById(R.id.annuityValueFVOA);
        interestFVOA = findViewById(R.id.interestFVOA);
        yearFVOA = findViewById(R.id.yearFVOA);
        compoundingRateFOVA = findViewById(R.id.compoundingRateFOVA);

        resultFVOA = findViewById(R.id.resultFVOA);

        resultFVOAbtn = findViewById(R.id.resultFVOAbtn);

        resultFVOAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int a = Integer.parseInt(annuityValueFVOA.getText().toString());
                    double i = Double.parseDouble((interestFVOA.getText().toString()));
                    int n = Integer.parseInt(yearFVOA.getText().toString());
                    int m = Integer.parseInt(compoundingRateFOVA.getText().toString());

                    final double power = Math.pow(1 + (i / (100 * m)), (n * m));

                    final double divide = i / (m * 100);

                    final double result = a * ((power - 1) / divide);


                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    String result1 = decimalFormat.format(Double.valueOf(result));

                    resultFVOA.setText(getString(R.string.q) + result1);
                } catch (Exception e) {

                    Toast.makeText(FvOfOrdinaryAnnuity.this, "Please Enter the Missing Value", Toast.LENGTH_SHORT).show();
                }


            }


        });


    }
}
