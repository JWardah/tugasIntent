package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button image, jumlah, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        image = findViewById(R.id.btImage);
        jumlah = findViewById(R.id.btJumlah);
        about = findViewById(R.id.btAbout);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Image = new Intent(getApplicationContext(), Image.class);
                startActivity(Image);
            }
        });
        jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Jumlah = new Intent(getApplicationContext(), Jumlah.class);
                startActivity(Jumlah);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent About = new Intent(getApplicationContext(), About.class);
                startActivity(About);
            }
        });
    }
}
