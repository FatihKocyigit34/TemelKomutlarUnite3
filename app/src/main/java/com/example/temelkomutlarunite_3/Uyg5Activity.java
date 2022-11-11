package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {

    Button btnUyg5;
    Button btnGeri;
    TextView txtCalistirUyg5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);
        txtCalistirUyg5 = findViewById(R.id.txtCalistirUyg5);
        btnUyg5 = findViewById(R.id.btnUyg5);

        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ondaliklisayi1 = 1f/3f;
                double ondaliklisayi2 = 1d/3d;
                System.out.println("Float Sayı (1 / 3): " + ondaliklisayi1);
                System.out.println("Double Sayı (1 / 3): " + ondaliklisayi2);
                txtCalistirUyg5.setVisibility(View.VISIBLE);
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg5Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
