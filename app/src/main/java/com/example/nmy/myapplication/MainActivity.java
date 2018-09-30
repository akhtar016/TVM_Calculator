package com.example.nmy.myapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pvbtn, fvBtn, deveInfo, pvOAfBtn, fvOAfBtn, pvADfBtn, fvADfBtn, perpetualBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pvBtn(View view) {

        pvbtn = findViewById(R.id.pvBtn);

        Intent pvIntent = new Intent(this, PresentValue.class);
        startActivity(pvIntent);

    }

    public void fvBtn(View view) {
        fvBtn = findViewById(R.id.fvBtn);

        Intent fvIntent = new Intent(this, FutureValue.class);
        startActivity(fvIntent);


    }

    public void developerInfo(View view) {

        deveInfo = findViewById(R.id.developInfo);


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Developer Information");
        alertDialogBuilder.setMessage("" +
                "Name: Md. Akhtaruzzaman Khan(Nayem)\n" +
                "Email:\n" +
                "akhtaruzzamankhan016@gmail.com\n" +
                "Dept. of Finance & Banking(8th Batch)\nIslamic University\n" +
                "Kushtia");
        alertDialogBuilder.show();


    }


    public void pvOAfBtn(View view) {

        pvOAfBtn = findViewById(R.id.pvOAfBtn);
        Intent pvIntent = new Intent(this, PvofOrdinaryAnnuity.class);
        startActivity(pvIntent);

    }

    public void fvOAfBtn(View view) {

        fvOAfBtn = findViewById(R.id.fvOAfBtn);


        Intent fvIntent = new Intent(this, FvOfOrdinaryAnnuity.class);
        startActivity(fvIntent);
    }

    public void pvAfBtn(View view) {

        pvADfBtn = findViewById(R.id.pvADfBtn);

        Intent fvIntent = new Intent(this, PvOfAnnuityDue.class);
        startActivity(fvIntent);


    }

    public void fvAfBtn(View view) {

        fvADfBtn = findViewById(R.id.fvADfBtn);
        Intent fvIntent = new Intent(this, FvAnnuityDue.class);
        startActivity(fvIntent);

    }

    public void perBtn(View view) {

        perpetualBtn = findViewById(R.id.perpetualBtn);

        Intent fvIntent = new Intent(this, PerpetualAnnuity.class);
        startActivity(fvIntent);


    }
}
