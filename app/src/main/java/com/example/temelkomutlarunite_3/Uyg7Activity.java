package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uyg7_activity);

        //----------------TextView Tanımlama Kısmı----------------
        TextView txtToplama;
        txtToplama = findViewById(R.id.txtToplama2);
        TextView txtCikarma;
        txtCikarma = findViewById(R.id.txtCikarma2);
        TextView txtBolme;
        txtBolme = findViewById(R.id.txtBolme2);
        TextView txtMod;
        txtMod = findViewById(R.id.txtMod2);
        TextView txtCarpma;
        txtCarpma = findViewById(R.id.txtCarpma2);
        TextView txtArtis;
        txtArtis = findViewById(R.id.txtArtis2);
        TextView txtAzalis;
        txtAzalis = findViewById(R.id.txtAzalis2);

        //----------------EditText ve Button Tanımlama Kısmı----------------
        EditText xsayi;
        xsayi = findViewById(R.id.editTxtSayi1);
        EditText ysayi;
        ysayi = findViewById(R.id.editTxtSayi2);
        TextView txtCalistirildi;
        txtCalistirildi = findViewById(R.id.txtCalistirildi);
        Button btnCalistir;
        btnCalistir = findViewById(R.id.btnCalistir);
        //---------------------------------------

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(xsayi.getText().toString());
                int y = Integer.parseInt(ysayi.getText().toString());
                //---------------------------------------
                int toplama = x + y;
                txtToplama.setText("Toplamı: "+toplama);
                //---------------------------------------
                int fark = x - y;
                txtCikarma.setText("Farkı: "+fark);
                //---------------------------------------
                int carpma = x * y;
                txtCarpma.setText("Çarpımı: "+carpma);
                //---------------------------------------
                int mod = x % y;
                txtMod.setText("Modu: "+mod);
                //---------------------------------------
                int bolme = x / y;
                txtBolme.setText("Bölümü: "+bolme);
                //---------------------------------------
                x++;
                txtArtis.setText("Artışı: "+ x);
                //---------------------------------------
                y--;
                txtAzalis.setText("Azalışı: "+ y);
                //---------------------------------------
                txtCalistirildi.setVisibility(View.VISIBLE);
                //---------------------------------------

                /*System.out.println("Toplamı: " + toplama);
                System.out.println("Farkı: " + fark);
                System.out.println("Çarpımı: " + carpma);
                System.out.println("Mod: " + mod);
                System.out.println("Bölümü: " + bolme);
                System.out.println("Arttırma: " + x);
                System.out.println("Azaltma: " + y);*/

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
