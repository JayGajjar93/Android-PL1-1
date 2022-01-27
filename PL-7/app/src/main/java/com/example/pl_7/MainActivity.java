package com.example.pl_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnzero,btnclear,btndzero;
    Button btnadd,btnsub,btnmul,btndiv,btnequals;
    EditText tbnum;
    public int num1=0,num2=0,ans=0,flag=0,operation=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_activity);

        btnone=findViewById(R.id.one);
        btntwo=findViewById(R.id.two);
        btnthree=findViewById(R.id.three);
        btnfour=findViewById(R.id.four);
        btnfive=findViewById(R.id.five);
        btnsix=findViewById(R.id.six);
        btnseven=findViewById(R.id.seven);
        btneight=findViewById(R.id.eight);
        btnnine=findViewById(R.id.nine);
        btnzero=findViewById(R.id.zero);
        btnclear=findViewById(R.id.clear);
        btndzero=findViewById(R.id.dzero);

        btnadd=findViewById(R.id.addition);
        btnsub=findViewById(R.id.subraction);
        btnmul=findViewById(R.id.multiplication);
        btndiv=findViewById(R.id.division);
        btnequals=findViewById(R.id.equals);

        tbnum=findViewById(R.id.num);


        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=1;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=1;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }

            }
        });

        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=2;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else
                {
                    num2=2;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=3;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=3;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=4;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=4;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=5;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=5;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=6;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=6;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=7;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=7;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=8;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=8;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=9;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=9;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=0;
                    tbnum.setText(tbnum.getText().toString()+num1);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=0;
                    tbnum.setText(tbnum.getText().toString()+num2);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btndzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    num1=00;
                    String dze=tbnum.getText().toString()+num2+"0";
                    tbnum.setText(dze);
                    num1=Integer.parseInt(tbnum.getText().toString());
                }
                else if(flag==1)
                {
                    num2=00;
                    String dze=tbnum.getText().toString()+num2+"0";
                    tbnum.setText(dze);
                    num2=Integer.parseInt(tbnum.getText().toString());
                }
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=0;
                num2=0;
                flag=0;
                tbnum.setHint("Enter Number 1");
                tbnum.setText("");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag=1;
                tbnum.setText("");
                tbnum.setHint("Enter Number 2");
                operation=1;
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag=1;
                tbnum.setText("");
                tbnum.setHint("Enter Number 2");
                operation=2;
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag=1;
                tbnum.setText("");
                tbnum.setHint("Enter Number 2");
                operation=3;
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag=1;
                tbnum.setText("");
                tbnum.setHint("Enter Number 2");
                operation=4;
            }
        });

        btnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(operation)
                {
                    case 1:
                        ans=num1+num2;
                        Toast.makeText(getApplicationContext(),"Addition Applied",Toast.LENGTH_LONG).show();
                        tbnum.setText(String.valueOf(ans));
                        break;

                    case 2:
                        ans=num1-num2;
                        Toast.makeText(getApplicationContext(),"Subtraction Applied",Toast.LENGTH_LONG).show();
                        tbnum.setText(String.valueOf(ans));
                        break;

                    case 3:
                        ans=num1*num2;
                        Toast.makeText(getApplicationContext(),"Multiplication Applied",Toast.LENGTH_LONG).show();
                        tbnum.setText(String.valueOf(ans));
                        break;

                    case 4:
                        ans=num1/num2;
                        Toast.makeText(getApplicationContext(),"Division Applied",Toast.LENGTH_LONG).show();
                        tbnum.setText(String.valueOf(ans));
                        break;
                }
            }
        });
    }
}