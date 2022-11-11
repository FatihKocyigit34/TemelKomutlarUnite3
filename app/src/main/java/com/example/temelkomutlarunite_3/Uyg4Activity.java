package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Button btnGeri;
    Button btnAscii;
    TextView txtCalistirUyg4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        btnGeri = findViewById(R.id.btnGeri);
        btnAscii = findViewById(R.id.btnAscii);
        txtCalistirUyg4 = findViewById(R.id.txtCalistir);

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg4Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnAscii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char karakter = 'a';
                int ascii = (int) + 'a';
                System.out.println(karakter);
                System.out.println(ascii);
                txtCalistirUyg4.setVisibility(View.VISIBLE);
            }
        });
    }
}
