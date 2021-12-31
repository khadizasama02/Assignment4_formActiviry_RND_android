package com.first.assignment4_formactiviry_rnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tv = findViewById(R.id.textView);
        String gender = getIntent().getExtras().getString("gender");
        tv.setText("Gender "+gender);


    }
}