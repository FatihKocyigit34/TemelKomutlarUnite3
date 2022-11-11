package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    Button btnChar;
    Button btnGeri;
    TextView txtCalistirUyg3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
        btnChar = findViewById(R.id.btnChar);
        btnGeri = findViewById(R.id.btnGeri);
        txtCalistirUyg3 = findViewById(R.id.txtCalistirUyg5);

        btnChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char karakter = 'A';
                System.out.println("Karakter: " + karakter);
                karakter = 'A' + 1;
                System.out.println("Yeni Karakter İlk İşlem: " + karakter);
                karakter = 'A' + 32;
                System.out.println("Yeni Karakter İkinci İşlem: " + karakter);
                txtCalistirUyg3.setVisibility(View.VISIBLE);
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg3Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
