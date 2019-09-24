package com.si.pranishsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnSI, btnFtoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btnSI = findViewById(R.id.btnSI);
        btnFtoC = findViewById(R.id.btnFtoC);

        btnSI.setOnClickListener(this);
        btnFtoC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnSI){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);



        }

    }
}
