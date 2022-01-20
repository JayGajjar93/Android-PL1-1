package com.example.pl_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnconvert;
    TextView txtanswer;
    EditText tbkilogram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnconvert=findViewById(R.id.convert);
        txtanswer=findViewById(R.id.answer);
        tbkilogram=findViewById(R.id.kilogram);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double p = 2.2;
                double kg = Double.parseDouble(tbkilogram.getText().toString());
                double ans=kg*p;

                txtanswer.setText("Pounds : " + String.valueOf(ans) +" lbs");





            }
        });
    }
}