package com.example.pl1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnsubmit;
    TextView txtresult;
    EditText tbname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaration
        btnsubmit=findViewById(R.id.submit);
        txtresult=findViewById(R.id.result);
        tbname=findViewById(R.id.enterName);

        //Btn Click Event onClick
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Displaying Data
                txtresult.setText(tbname.getText().toString());

                //Toast Display Message
                Toast.makeText(getApplicationContext(),"Name Showed Below, Thank You!",Toast.LENGTH_LONG).show();
            }
        });





    }
}