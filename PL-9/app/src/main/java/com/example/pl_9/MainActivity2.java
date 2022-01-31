package com.example.pl_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        out=findViewById(R.id.lboutput);

        Bundle extras=getIntent().getExtras();
        String uname=extras.get("logincheck").toString();
        out.setText("Welcome "+uname);
    }
}