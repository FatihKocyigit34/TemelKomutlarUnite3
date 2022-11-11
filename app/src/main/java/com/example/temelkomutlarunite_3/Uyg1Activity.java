package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    Button btnGeri;
    Button btnCalistir;
    TextView txtCalistir;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        txtCalistir = findViewById(R.id.txtCalistirUyg5);
        btnGeri = findViewById(R.id.btnGeri);

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg1Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean degisken1 = true;
                boolean degisken2 = false;
                System.out.println("Değişken 1: " + degisken1 + " Değişken 2: " + degisken2);
                txtCalistir.setVisibility(View.VISIBLE);
            }
        });

    }
}
