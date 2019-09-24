package com.si.pranishsi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int result, principal, time, rate;
    private EditText etp, ett, etr;
    private Button btnSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etp = findViewById(R.id.etp);
        ett = findViewById(R.id.ett);
        etr = findViewById(R.id.etr);

        btnSI = findViewById(R.id.btnSI);


        btnSI.setOnClickListener(new View.OnClickListener() {
            //                @Override
            public void onClick(View v) {
                principal = Integer.parseInt(etp.getText().toString());
                time = Integer.parseInt(ett.getText().toString());
                rate = Integer.parseInt(etr.getText().toString());
                result = (principal * time * rate) / 100;
                Toast.makeText(MainActivity.this, "The Simple Interest is " + result, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
