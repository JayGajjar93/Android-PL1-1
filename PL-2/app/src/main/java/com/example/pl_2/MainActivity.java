package com.example.pl_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btncheck;
    EditText tbnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncheck=findViewById(R.id.check);
        tbnum=findViewById(R.id.editTextNumber);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r,sum=0,temp;
                int n=Integer.parseInt(String.valueOf(tbnum.getText()));
                temp=n;
                while(n>0)
                {
                    r=n%10;
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(temp==sum)
                {
                    Toast.makeText(getApplicationContext(),"Entered Number is PALINDROME",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Entered Number is NOT PALINDROME",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}