package com.example.nmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class PvofOrdinaryAnnuity extends AppCompatActivity {


    EditText annuityValuePVOA, interestPVOA, yearPVOA, compoundingRatePOVA;

    TextView resultPVOA;

    Button resultPVOAbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvof_ordinary_annuity);

        annuityValuePVOA = findViewById(R.id.annuityValuePVOA);
        interestPVOA = findViewById(R.id.interestPVOA);
        yearPVOA = findViewById(R.id.yearPVOA);
        compoundingRatePOVA = findViewById(R.id.compoundingRatePOVA);

        resultPVOA = findViewById(R.id.resultPVOA);

        resultPVOAbtn = findViewById(R.id.resultPVOAbtn);

        resultPVOAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int a = Integer.parseInt(annuityValuePVOA.getText().toString());
                    double i = Double.parseDouble((interestPVOA.getText().toString()));
                    int n = Integer.parseInt(yearPVOA.getText().toString());
                    int m = Integer.parseInt(compoundingRatePOVA.getText().toString());


                    final double power = Math.pow(1 + (i / (100 * m)), (-n * m));

                    final double divide = i / (m * 100);

                    final double result = a * ((1 - power) / divide);


                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    String result1 = decimalFormat.format(Double.valueOf(result));

                    resultPVOA.setText(getString(R.string.l) + result1);
                } catch (Exception e) {

                    Toast.makeText(PvofOrdinaryAnnuity.this, "Please Enter the Missing Value", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
