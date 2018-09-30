package com.example.nmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FutureValue extends AppCompatActivity {

    EditText editText_presentValue, editText_interestRate, editText_year, editText_compoundingRate;
    TextView result_TextView;

    Button button_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_value);


        editText_presentValue = findViewById(R.id.editText_presentValue);
        editText_interestRate = findViewById(R.id.editText_interestRate);
        editText_year = findViewById(R.id.editText_year);
        editText_compoundingRate = findViewById(R.id.editText_compoundingRate);

        result_TextView = findViewById(R.id.result_TextView);

        button_result = findViewById(R.id.button_result);

        button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    int presentValue = Integer.parseInt(editText_presentValue.getText().toString());
                    double interestRate = Double.parseDouble((editText_interestRate.getText().toString()));
                    int numberOfYear = Integer.parseInt(editText_year.getText().toString());
                    int compoundRate = Integer.parseInt(editText_compoundingRate.getText().toString());


                    final double result = presentValue * Math.pow(1 + (interestRate / (100 * compoundRate)), (numberOfYear * compoundRate));


                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    String result1 = decimalFormat.format(Double.valueOf(result));

                    result_TextView.setText(getString(R.string.result) + result1);
                } catch (Exception e) {


                    result_TextView.setText("");
                    Toast.makeText(FutureValue.this, "Please Enter The Missing Value", Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}
