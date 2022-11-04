package com.example.temelkomutlarunite_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg1;
    Button btnUyg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUyg1 = findViewById(R.id.btnUyg1);
        btnUyg2 = findViewById(R.id.btnUyg2);

        btnUyg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
                startActivity(i);
            }
        });
        btnUyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
                startActivity(i);
            }
        });
    }
}