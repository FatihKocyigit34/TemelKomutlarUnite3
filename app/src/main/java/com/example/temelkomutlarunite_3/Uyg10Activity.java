package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        //----------------TextView Tanımlama Kısmı----------------
        TextView txtVe;
        txtVe = findViewById(R.id.txtVe);
        TextView txtVeya;
        txtVeya = findViewById(R.id.txtVeya);
        TextView txtMantiksalDegil;
        txtMantiksalDegil = findViewById(R.id.txtMantiksalDegil);
        TextView txtMantiksalDegil2;
        txtMantiksalDegil2 = findViewById(R.id.txtMantiksalDegil2);

        //----------------EditText ve Button Tanımlama Kısmı----------------
        EditText editTxtSayi1;
        editTxtSayi1 = findViewById(R.id.editTxtSayi1_10);
        EditText editTxtSayi2;
        editTxtSayi2 = findViewById(R.id.editTxtSayi2_10);
        Button btnCalistir;
        btnCalistir = findViewById(R.id.btnCalistir_10);
        Button btnGeridon;
        btnGeridon = findViewById(R.id.btnGeridon2_10);

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(editTxtSayi1.getText().toString());
                int y = Integer.parseInt(editTxtSayi2.getText().toString());
                //---------------------------------------
                txtVe.setText("X ve Y 15`e Eşitmidir:" + (x == 15 && y == 15));
                //---------------------------------------
                txtMantiksalDegil2.setText("X ve Y 15`e Eşitmidir Tersi:" + !(x == 15 && y == 15));
                //---------------------------------------
                txtVeya.setText("X veya Y 15`e Bir Tanesi Eşitmidir: " + (x == 15 || y == 15));
                //---------------------------------------
                txtMantiksalDegil.setText("X veya Y 15`e Bir Tanesi Eşitmidir Tersi: " + !(x == 15 || y == 15));
            }
        });

        btnGeridon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg10Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
