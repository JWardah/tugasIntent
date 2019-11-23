package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Jumlah extends AppCompatActivity {
    EditText bil1, bil2, hasil;
    Button tambah, kurang, bagi, kali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumlah);
        bil1 = findViewById(R.id.bil1);
        bil2 = findViewById(R.id.bil2);
        hasil = findViewById(R.id.hsl);
        tambah = findViewById(R.id.btnPlus);
        kurang = findViewById(R.id.btnMin);
        kali = findViewById(R.id.btnKali);
        bagi = findViewById(R.id.btnBagi);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasiltmbh();
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilkrg();
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilkl();
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilbg();
            }
        });
    }

    private void hasilbg() {
        double bilangan1 = Integer.parseInt(bil1.getText().toString());
        double bilangan2 = Integer.parseInt(bil2.getText().toString());
        double hasilbgi = bilangan1 / bilangan2;
        hasil.setText(hasilbgi + "");
    }

    private void hasilkl() {
        int bilangan1 = Integer.parseInt(bil1.getText().toString());
        int bilangan2 = Integer.parseInt(bil2.getText().toString());
        int hasilkli = bilangan1 * bilangan2;
        hasil.setText(hasilkli + "");
    }

    private void hasilkrg() {
        int bilangan1 = Integer.parseInt(bil1.getText().toString());
        int bilangan2 = Integer.parseInt(bil2.getText().toString());
        int hasilkrg = bilangan1 - bilangan2;
        hasil.setText(hasilkrg + "");
    }

    private void hasiltmbh() {
        int bilangan1 = Integer.parseInt(bil1.getText().toString());
        int bilangan2 = Integer.parseInt(bil2.getText().toString());
        int hasilplus = bilangan1 + bilangan2;
        hasil.setText(hasilplus + "");
    }
}
