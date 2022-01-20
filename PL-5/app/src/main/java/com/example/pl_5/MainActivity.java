package com.example.pl_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnaddition;
    Button btnsubtraction;
    Button btndivision;
    Button btnmultiplication;
    EditText num1;
    EditText num2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linlay1);

        btnaddition=findViewById(R.id.btnadd);
        btnsubtraction=findViewById(R.id.btnminus);
        btndivision=findViewById(R.id.btndivide);
        btnmultiplication=findViewById(R.id.btnmultiply);
        num1=findViewById(R.id.no1);
        num2=findViewById(R.id.no2);
        ans=findViewById(R.id.result);


        btnaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(String.valueOf(num1.getText()));
                int n2=Integer.parseInt(String.valueOf(num2.getText()));
                int add=n1+n2;
                ans.setText("Addition : "+add);
            }
        });

        btnsubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(String.valueOf(num1.getText()));
                int n2=Integer.parseInt(String.valueOf(num2.getText()));
                int sub=n1-n2;
                ans.setText("Subtraction : "+sub);
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(String.valueOf(num1.getText()));
                int n2=Integer.parseInt(String.valueOf(num2.getText()));
                int div=n1/n2;
                ans.setText("Division : "+div);
            }
        });

        btnmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(String.valueOf(num1.getText()));
                int n2=Integer.parseInt(String.valueOf(num2.getText()));
                int mul=n1*n2;
                ans.setText("Multiplication : "+mul);
            }
        });

    }
}