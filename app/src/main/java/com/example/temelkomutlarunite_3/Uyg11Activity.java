package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {
    private final String TAG = "Etiket";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11_activity);
        Button btnCalistir;
        Button btnGeridon;
        EditText txtEdit11;
        btnCalistir = findViewById(R.id.btnCalistir_11);
        txtEdit11 = findViewById(R.id.txtEdit11);
        btnGeridon = findViewById(R.id.btnGeridon_11);
        Log.d(TAG, "Debug (Hata Ayıklama)");

        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Düğmeye Tıklandı");
                Log.i(TAG, "Edit Text sayi Değişkenine Tanımlandı");
                int sayi = Integer.parseInt(txtEdit11.getText().toString());
                Log.i(TAG, "Edit Textin İçine Veri Girildi");
                String yazi = toString();
                Log.i(TAG, "sayi Değişkeni String İfadeye Çevrildi");
                yazi = yazi + " String İfade";
                Log.i(TAG,"yazi Değişkeninin yanına String İfade Yazdırıldı");


            }
        });

        btnGeridon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg11Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
