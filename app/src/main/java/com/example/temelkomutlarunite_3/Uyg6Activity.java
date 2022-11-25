package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    Button btnCalistir;
    TextView txtCalistirildi;
    Button geridon;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        btnCalistir = findViewById(R.id.btnCalistir);
        txtCalistirildi = findViewById(R.id.txtCalistirildi8);
        geridon = findViewById(R.id.btnGeridon);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int pi = 3;
                int yaricap = 6;
                System.out.println("Çevre = " + (2*pi*yaricap));
                txtCalistirildi.setVisibility(View.VISIBLE);
            }
        });
        geridon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg6Activity.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}
