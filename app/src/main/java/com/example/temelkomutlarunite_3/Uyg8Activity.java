package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
        //----------------EditText ve Button Tanımlama Kısmı----------------
        EditText sayi1;
        sayi1 = findViewById(R.id.txtSayi1);
        Button Calistir;
        Calistir = findViewById(R.id.btnCalistir2);
        Button btnGeridon;
        btnGeridon = findViewById(R.id.btnGeridon8);

        //----------------TextView Tanımlama Kısmı----------------
        TextView calistirildi;
        calistirildi = findViewById(R.id.txtCalistirildi2);
        TextView Basit;
        Basit = findViewById(R.id.txtBasit2);
        TextView ToplaAta;
        ToplaAta = findViewById(R.id.txtTopaAta2);
        TextView CikartAta;
        CikartAta = findViewById(R.id.txtCikartAta2);
        TextView BolAta;
        BolAta = findViewById(R.id.txtBolAta2);
        TextView CarpAta;
        CarpAta = findViewById(R.id.txtCarpAta2);
        TextView ModAta;
        ModAta = findViewById(R.id.txtModAta2);

        Calistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(sayi1.getText().toString());
                //---------------------------------------
                Basit.setText("Basit Atama Operatörü: "+ x);
                //---------------------------------------
                x = x + 3;
                ToplaAta.setText("Toplama Atama Operatörü: "+ x);
                //---------------------------------------
                x = x - 2;
                CikartAta.setText("Çıkarma Atama Operatörü: "+ x);
                //---------------------------------------
                x = x / 2;
                BolAta.setText("Bölme Atama Operatörü: "+ x);
                //---------------------------------------
                x = x * 4;
                CarpAta.setText("Çarpma Atama Operatörü: "+ x);
                //---------------------------------------
                x = x % 2;
                ModAta.setText("Mod Atama Operatörü: "+ x);
                //---------------------------------------
                calistirildi.setVisibility(View.VISIBLE);
            }

        });

        btnGeridon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg8Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
