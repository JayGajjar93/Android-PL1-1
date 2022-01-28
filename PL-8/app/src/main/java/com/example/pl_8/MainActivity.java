package com.example.pl_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity1);

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1==0)
                {
                    b1.setText("X");
                    flag1++;
                }
                else
                {
                    b1.setText("O");
                    flag1=0;
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2==0)
                {
                    b2.setText("X");
                    flag2++;
                }
                else
                {
                    b2.setText("O");
                    flag2=0;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3==0)
                {
                    b3.setText("X");
                    flag3++;
                }
                else
                {
                    b3.setText("O");
                    flag3=0;
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag4==0)
                {
                    b4.setText("X");
                    flag4++;
                }
                else
                {
                    b4.setText("O");
                    flag4=0;
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag5==0)
                {
                    b5.setText("X");
                    flag5++;
                }
                else
                {
                    b5.setText("O");
                    flag5=0;
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag6==0)
                {
                    b6.setText("X");
                    flag6++;
                }
                else
                {
                    b6.setText("O");
                    flag6=0;
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag7==0)
                {
                    b7.setText("X");
                    flag7++;
                }
                else
                {
                    b7.setText("O");
                    flag7=0;
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag8==0)
                {
                    b8.setText("X");
                    flag8++;
                }
                else
                {
                    b8.setText("O");
                    flag8=0;
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag9==0)
                {
                    b9.setText("X");
                    flag9++;
                }
                else
                {
                    b9.setText("O");
                    flag9=0;
                }
            }
        });




    }
}