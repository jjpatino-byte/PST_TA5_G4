package com.example.LibOnline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void salir(View view) {
        finish();
    }

    public void home(View view){
        finish();
    }

    public void categoria(View view){
        finish();
        Intent i = new Intent(this, Categoria.class );
        startActivity(i);
    }
}