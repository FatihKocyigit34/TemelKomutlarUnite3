package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {

    Button btnUyg5;
    TextView txtCalistir;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);
        txtCalistir = findViewById(R.id.txtCalistir);
        btnUyg5 = findViewById(R.id.btnUyg5);

        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ondaliklisayi1 = 1f/3f;
                double ondaliklisayi2 = 1d/3d;
                System.out.println("Float Sayı (1 / 3): " + ondaliklisayi1);
                System.out.println("Double Sayı (1 / 3): " + ondaliklisayi2);
                txtCalistir.setVisibility(View.VISIBLE);
            }
        });
    }
}
