package com.example.temelkomutlarunite_3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg12Activity extends AppCompatActivity {

    Button btnGeridon;
    Button btnCalistir;
    EditText editxt;
    final String TAG = "Etiket";
    int sayi = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uyg12_activity);

        btnGeridon = findViewById(R.id.btnGeridon);
        btnGeridon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Uyg12Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnCalistir = findViewById(R.id.btnCalistir_12);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i(TAG, "Düğmeye basıldı");

                editxt = findViewById(R.id.editxt);
                Log.i(TAG, "EditText tanımlandı");

                String sayi1 = editxt.getText().toString();
                Log.i(TAG, "EditText içindeki ifade alındı");

                try {

                    sayi = Integer.parseInt(sayi1);
                    Log.i(TAG, "String ifade Sayıya çevrildi");

                } catch (Exception e) {

                    Log.e(TAG, "İfade sayıya çevrilemedi");
                    sayi = 0;

                } finally {

                    sayi = sayi + 2;
                    Log.i(TAG, "finally sayı: " + sayi);

                }
            }
        });
    }
}
