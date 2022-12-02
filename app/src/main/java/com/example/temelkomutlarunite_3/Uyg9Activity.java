package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);

        //----------------EditText ve Button Tanımlama Kısmı----------------
        Button btnCalistir;
        btnCalistir = findViewById(R.id.btnCalistir_9);
        Button btnGeridon;
        btnGeridon = findViewById(R.id.btnGeridon2_9);
        EditText txtSayi1;
        txtSayi1 = findViewById(R.id.editTxtSayi1_9);
        EditText txtSayi2;
        txtSayi2 = findViewById(R.id.editTxtSayi2_9);

        //----------------TextView Tanımlama Kısmı----------------
        TextView txtEsitmi;
        txtEsitmi = findViewById(R.id.txtEsitmi);
        TextView txtBuyukmu;
        txtBuyukmu = findViewById(R.id.txtBuyukmuKucukmu);
        TextView txtKucukmu;
        txtKucukmu = findViewById(R.id.txtKucukmu);
        TextView txtBuyukEsitmi;
        txtBuyukEsitmi = findViewById(R.id.txtBuyukEsitmi);
        TextView txtKucukEsitmi;
        txtKucukEsitmi = findViewById(R.id.txtKucukEsitmi);
        TextView txtFarkli;
        txtFarkli = findViewById(R.id.txtFarklimi);

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtSayi1.getText().toString());
                int y = Integer.parseInt(txtSayi2.getText().toString());
                //---------------------------------------
                txtEsitmi.setText("X ile Y Eşitmi: " + (x == y));
                //---------------------------------------
                txtBuyukmu.setText("X Y`den Büyükmü: " + (x > y));
                //---------------------------------------
                txtKucukmu.setText("X Y`den Küçükmü: " + (x < y));
                //---------------------------------------
                txtBuyukEsitmi.setText("X Y`den Büyük veya Eşitmi: " + (x >= y));
                //---------------------------------------
                txtKucukEsitmi.setText("X Y`den Küçük veya Eşitmi: " + (x <= y));
                //---------------------------------------
                txtFarkli.setText("X ile Y Farklımı: " + (x != y));
                //---------------------------------------

            }
        });

        btnGeridon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg9Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
