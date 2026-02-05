package com.example.nicestart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class perfil extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perfil);

//        findViewById(R.id.back_arrow).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Vuelve al MainActivity
//                Intent intent = new Intent(perfil.this, MainActivity.class);
//                startActivity(intent);
//                finish(); // opcional, para cerrar el perfil
//            }
//        });
    }
}