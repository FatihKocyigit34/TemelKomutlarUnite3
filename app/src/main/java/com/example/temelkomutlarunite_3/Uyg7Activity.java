package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Uyg7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uyg7_activity);
        EditText xsayi;
        xsayi = findViewById(R.id.editTxtSayi1);
        EditText ysayi;
        ysayi = findViewById(R.id.editTxtSayi2);
        TextView txtCalistirildi;
        txtCalistirildi = findViewById(R.id.txtCalistirildi);
        Button btnCalistir;
        btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(xsayi.getText().toString());
                int y = Integer.parseInt(ysayi.getText().toString());
                int toplama = x + y;
                int fark = x - y;
                int carpma = x * y;
                int mod = x % y;
                int bolme = x / y;
                x++;
                y--;
                System.out.println("Toplamı: " + toplama);
                System.out.println("Farkı: " + fark);
                System.out.println("Çarpımı: " + carpma);
                System.out.println("Mod: " + mod);
                System.out.println("Bölümü: " + bolme);
                System.out.println("Arttırma: " + x);
                System.out.println("Azaltma: " + y);
                txtCalistirildi.setVisibility(View.VISIBLE);

            }
        });

        Button btnGeriDon;
        btnGeriDon = findViewById(R.id.btnGeridon);
        btnGeriDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg7Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
