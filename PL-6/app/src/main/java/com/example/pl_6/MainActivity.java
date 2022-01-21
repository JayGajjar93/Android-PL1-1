package com.example.pl_6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lbloncreate;
    TextView lblonstart;
    TextView lblonresume;
    TextView lblonpause;
    TextView lblonstop;
    TextView lblonrestart;
    TextView lblondestroy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbloncreate=findViewById(R.id.oncreate);
        lblonstart=findViewById(R.id.onstart);
        lblonresume=findViewById(R.id.onresume);
        lblonpause=findViewById(R.id.onpause);
        lblonstop=findViewById(R.id.onstop);
        lblonrestart=findViewById(R.id.onrestart);
        lblonstop=findViewById(R.id.ondestroy);

        lbloncreate.setTextColor(Color.parseColor("#FF0000"));
        Log.d("Lifecycle","onCreate Called");

    }

    @Override
    protected void onStart() {
        super.onStart();

        lblonstart.setTextColor(Color.parseColor("#FF0000"));
        Log.d("Lifecycle","onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        lblonresume.setTextColor(Color.parseColor("#FF0000"));
        Log.d("Lifecycle","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        lblonpause.setTextColor(Color.parseColor("#FF0000"));
        Log.d("Lifecycle","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        lblonpause.setTextColor(Color.parseColor("#FF0000"));
        Log.d("Lifecycle","onPause Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        lblonrestart.setTextColor(Color.parseColor("#FF0000"));
        Log.d("Lifecycle","onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        lblondestroy.setTextColor(Color.parseColor("#FF0000"));
        Log.d("Lifecycle","onDestroy Called");
    }
}