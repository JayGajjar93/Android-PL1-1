package com.example.pl_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnconvert;
    TextView cel;
    EditText far;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnconvert=findViewById(R.id.button);
        cel=findViewById(R.id.celcius);
        far=findViewById(R.id.farenheit);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int faren=Integer.parseInt(far.getText().toString());
                int celc=0;
                celc=((faren-32)*5)/9;
                cel.setText("Celcius : "+celc);

            }
        });
    }
}