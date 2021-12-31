package com.first.assignment4_formactiviry_rnd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rg);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=rg.getCheckedRadioButtonId();
                rb = findViewById(selectedId);
                String gender = rb.getText().toString();
                Intent ii = new Intent(getApplicationContext(),DetailsActivity.class);
                ii.putExtra("gender",gender);
                startActivity(ii);
            }
        });

    }
}