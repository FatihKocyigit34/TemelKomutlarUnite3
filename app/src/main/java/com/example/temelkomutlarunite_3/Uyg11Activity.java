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
                Log.v(TAG,"Düğmeye Tıklandı");
                Log.d(TAG, "Düğmeye Tıklandı");
                Log.w(TAG, "Düğmeye Tıklandı");
                Log.e(TAG, "Düğmeye Tıklandı");
                Log.i(TAG, "Edit Text sayi Değişkenine Tanımlandı");
                Log.v(TAG,"Edit Text sayi Değişkenine Tanımlandı");
                Log.d(TAG, "Edit Text sayi Değişkenine Tanımlandı");
                Log.w(TAG, "Edit Text sayi Değişkenine Tanımlandı");
                Log.e(TAG, "Edit Text sayi Değişkenine Tanımlandı");
                int sayi = Integer.parseInt(txtEdit11.getText().toString());
                Log.i(TAG, "Edit Textin İçine Veri Girildi");
                Log.v(TAG,"Edit Textin İçine Veri Girildi");
                Log.d(TAG, "Edit Textin İçine Veri Girildi");
                Log.w(TAG, "Edit Textin İçine Veri Girildi");
                Log.e(TAG, "Edit Textin İçine Veri Girildi");
                String yazi = toString();
                Log.i(TAG, "sayi Değişkeni String İfadeye Çevrildi");
                Log.v(TAG,"sayi Değişkeni String İfadeye Çevrildi");
                Log.d(TAG, "sayi Değişkeni String İfadeye Çevrildi");
                Log.w(TAG, "sayi Değişkeni String İfadeye Çevrildi");
                Log.e(TAG, "sayi Değişkeni String İfadeye Çevrildi");
                yazi = yazi + " String İfade";
                Log.i(TAG,"yazi Değişkeninin yanına String İfade Yazdırıldı");
                Log.v(TAG,"yazi Değişkeninin yanına String İfade Yazdırıldı");
                Log.d(TAG, "yazi Değişkeninin yanına String İfade Yazdırıldı");
                Log.w(TAG, "yazi Değişkeninin yanına String İfade Yazdırıldı");
                Log.e(TAG, "yazi Değişkeninin yanına String İfade Yazdırıldı");


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
