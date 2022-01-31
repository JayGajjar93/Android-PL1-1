package com.example.pl_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0;
    int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
    int btn_c1_click=0;
    TextView winner;

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
        winner=findViewById(R.id.lblwinner);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_c1_click == 0) {
                    if(flag1==0)
                    {
                        c1=1;
                        b1.setText("X");
                        flag1++;
                        btn_c1_click = 1;
                    }
                    else
                    {
                        c1=2;
                        b1.setText("O");
                        flag1=0;
                        btn_c1_click = 1;
                    }
                    if((c1==1 && c2==1 && c3==1) || (c1==1 && c4==1 && c7==1) || (c1==1 && c5==1 && c9==1))
                    {
                        winner.setText("-- X WINS --");

                    }
                    else if((c1==2 && c2==2 && c3==2) || (c1==2 && c4==2 && c7==2) || (c1==2 && c5==2 && c9==2))
                    {
                        winner.setText("-- O WINS --");
                    }


                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag2==0)
                {
                    c2=1;
                    b2.setText("X");
                    flag2++;
                }
                else
                {
                    c2=2;
                    b2.setText("O");
                    flag2=0;
                }

                if((c2==1 && c1==1 && c3==1) || (c2==1 && c5==1 && c8==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if((c2==2 && c1==2 && c3==2) || (c2==2 && c5==2 && c8==2))
                {
                    winner.setText("-- O WINS --");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag3==0)
                {
                    c3=1;
                    b3.setText("X");
                    flag3++;
                }
                else
                {
                    c3=2;
                    b3.setText("O");
                    flag3=0;
                }

                if((c3==1 && c2==1 && c1==1) || (c3==1 && c6==1 && c9==1) || (c3==1 && c5==1 && c7==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if((c3==2 && c2==2 && c1==2) || (c3==2 && c6==2 && c9==2) || (c3==2 && c5==2 && c7==2))
                {
                    winner.setText("-- O WINS --");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag4==0)
                {
                    c4=1;
                    b4.setText("X");
                    flag4++;
                }
                else
                {
                    c4=2;
                    b4.setText("O");
                    flag4=0;
                }

                if((c4==1 && c5==1 && c6==1) || (c4==1 && c1==1 && c7==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if((c4==2 && c5==2 && c6==2) || (c4==2 && c1==2 && c7==2))
                {
                    winner.setText("-- O WINS --");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag5==0)
                {
                    c5=1;
                    b5.setText("X");
                    flag5++;
                }
                else
                {
                    c5=2;
                    b5.setText("O");
                    flag5=0;
                }

                if((c5==1 && c4==1 && c6==1) || (c2==1 && c5==1 && c8==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if ((c5==2 && c4==2 && c6==2) || (c2==2 && c5==2 && c8==2))
                {
                    winner.setText("-- O WINS --");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag6==0)
                {
                    c6=1;
                    b6.setText("X");
                    flag6++;
                }
                else
                {
                    c6=2;
                    b6.setText("O");
                    flag6=0;
                }

                if((c6==1 && c3==1 && c9==1) || (c6==1 && c5==1 && c4==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if((c6==2 && c3==2 && c9==2) || (c6==2 && c5==2 && c4==2))
                {
                    winner.setText("-- O WINS --");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag7==0)
                {
                    c7=1;
                    b7.setText("X");
                    flag7++;
                }
                else
                {
                    c7=2;
                    b7.setText("O");
                    flag7=0;
                }
                if((c7==1 && c4==1 && c1==1) || (c7==1 && c5==1 && c3==1) || (c7==1 && c8==1 && c9==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if((c7==2 && c4==2 && c1==2) || (c7==2 && c5==2 && c3==2) || (c7==2 && c8==2 && c9==2))
                {
                    winner.setText("-- O WINS --");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag8==0)
                {
                    c8=1;
                    b8.setText("X");
                    flag8++;
                }
                else
                {
                    c8=2;
                    b8.setText("O");
                    flag8=0;
                }

                if((c8==1 && c5==1 && c2==1) || (c8==1 && c7==1 && c9==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if((c8==2 && c5==2 && c2==2) || (c8==2 && c7==2 && c9==2))
                {
                    winner.setText("-- O WINS --");
                }
            }


        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag9==0)
                {
                    c9=1;
                    b9.setText("X");
                    flag9++;
                }
                else
                {
                    c9=2;
                    b9.setText("O");
                    flag9=0;
                }

                if((c9==1 && c8==1 && c7==1) || (c9==1 & c5==1 && c1==1) || (c9==1 && c6==1 && c3==1))
                {
                    winner.setText("-- X WINS --");
                }
                else if((c9==2 && c8==2 && c7==2) || (c9==2 & c5==2 && c1==2) || (c9==2 && c6==2 && c3==2))
                {
                    winner.setText("-- O WINS --");
                }
            }
        });




    }
}