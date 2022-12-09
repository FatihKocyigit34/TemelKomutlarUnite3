package com.example.temelkomutlarunite_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg1;
    Button btnUyg2;
    Button btnUyg3;
    Button btnUyg4;
    Button btnUyg5;
    Button btnUyg6;
    Button btnUyg7;
    Button btnUyg8;
    Button btnUyg9;
    Button btnUyg10;
    Button btnUyg11;
    Button btnUyg12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnUyg1 = findViewById(R.id.btnUyg1);
        btnUyg2 = findViewById(R.id.btnUyg2);
        btnUyg3 = findViewById(R.id.btnUyg3);
        btnUyg4 = findViewById(R.id.btnUyg4);
        btnUyg5 = findViewById(R.id.btnUyg5);
        btnUyg6 = findViewById(R.id.btnUyg6);
        btnUyg7 = findViewById(R.id.btnUyg7);
        btnUyg8 = findViewById(R.id.btnUyg8);
        btnUyg9 = findViewById(R.id.btnUyg9);
        btnUyg10 = findViewById(R.id.btnUyg10);
        btnUyg11 = findViewById(R.id.btnUyg11);
        btnUyg12 = findViewById(R.id.btnUyg12);


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

        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(i);
            }
        });

        btnUyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(i);
            }
        });

        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(i);
            }
        });

        btnUyg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg6Activity.class);
                startActivity(i);
            }
        });

        btnUyg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg7Activity.class);
                startActivity(i);
            }
        });

        btnUyg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg8Activity.class);
                startActivity(i);
            }
        });

        btnUyg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg9Activity.class);
                startActivity(i);
            }
        });

        btnUyg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg10Activity.class);
                startActivity(i);
            }
        });

        btnUyg11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg11Activity.class);
                startActivity(i);
            }
        });

        btnUyg12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg12Activity.class);
                startActivity(i);
            }
        });

    }
}