package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {

    Button btnShort;
    Button btnLong;
    Button btnInt;
    Button btnByte;
    Button btnGeri;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
        btnShort = findViewById(R.id.btnShort);
        btnByte = findViewById(R.id.btnByte);
        btnInt = findViewById(R.id.btnInt);
        btnLong = findViewById(R.id.btnLong);
        btnGeri = findViewById(R.id.btnGeri);

        btnByte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte degisken1 = 127;
                System.out.println("Byte Değişken Değeri: " + degisken1);
            }
        });

        btnShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                short degisken2 = 32767;
                System.out.println("Short Değişken Değeri: " + degisken2);
            }
        });

        btnInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int degisken3 = 2147483647;
                System.out.println("İnt Değişken Değeri" + degisken3);
            }
        });

        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long degisken4 =  9223372036854775807L;
                System.out.println("Long Değişken Değeri: " + degisken4);
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(Uyg2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
