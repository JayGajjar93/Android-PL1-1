package com.example.pl_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button email,dailer,sms,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.btnemail);
        dailer=findViewById(R.id.btndailer);
        sms=findViewById(R.id.btnsms);
        url=findViewById(R.id.btnurl);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL,"jaygajjar93@gmail.com");
                i.putExtra(Intent.EXTRA_SUBJECT,"IMPLICIT INTENT PRACTICAL");
                i.putExtra(Intent.EXTRA_TEXT,"Practical-10 Done And Submitted");
                startActivity(i.createChooser(i,"CHOOSE HERE"));
            }
        });

        dailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:+917817833094"));
                startActivity(i);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("smsto:+917817833094"));
                i.putExtra("sms_body","Hello, Jay Gajjar Here");
                startActivity(i);
            }
        });

        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(i);
            }
        });

    }
}