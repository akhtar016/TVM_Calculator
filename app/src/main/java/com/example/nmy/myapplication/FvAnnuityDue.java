package com.example.nmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FvAnnuityDue extends AppCompatActivity {


    EditText annuityValueFVAD, interestFVAD, yearFVAD, compoundingRateFVAD;

    TextView resultFVAD;

    Button resultFVADbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fv_annuity_due);

        annuityValueFVAD = findViewById(R.id.annuityValueFVAD);
        interestFVAD = findViewById(R.id.interestFVAD);
        yearFVAD = findViewById(R.id.yearFVAD);
        compoundingRateFVAD = findViewById(R.id.compoundingRateFVAD);

        resultFVAD = findViewById(R.id.resultFVAD);

        resultFVADbtn = findViewById(R.id.resultFVADbtn);


        resultFVADbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    int a = Integer.parseInt(annuityValueFVAD.getText().toString());
                    double i = Double.parseDouble((interestFVAD.getText().toString()));
                    int n = Integer.parseInt(yearFVAD.getText().toString());
                    int m = Integer.parseInt(compoundingRateFVAD.getText().toString());

                    final double power = Math.pow(1 + (i / (100 * m)), (n * m));

                    final double divide = i / (m * 100);

                    final double result = a * ((power - 1) / divide);
                    final double result2 = result * (1 + (i / (100 * m)));


                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    String result1 = decimalFormat.format(Double.valueOf(result2));

                    resultFVAD.setText(getString(R.string.sdf) + result1);
                } catch (Exception e) {

                    Toast.makeText(FvAnnuityDue.this, "Please Enter the Missing Value", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
