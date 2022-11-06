package com.migueldev.supernac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Teste_Produtos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_teste_produtos);

    }
}