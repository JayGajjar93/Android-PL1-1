package com.example.pl_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText tbuname,tbpassword;
    String uname="";
    String password="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.btnlogin);
        tbuname=findViewById(R.id.txtusername);
        tbpassword=findViewById(R.id.txtpass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname=String.valueOf(tbuname.getText());
                password=String.valueOf(tbpassword.getText().toString());
                if(uname.equals("admin") && password.equals("admin"))
                {
                    Intent i=new Intent(view.getContext(),MainActivity2.class);
                    i.putExtra("logincheck",uname);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"INVALID CREDENTAILS !!",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}