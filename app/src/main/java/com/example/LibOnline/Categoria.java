package com.example.LibOnline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Categoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
    }

    public void perfil(View view) {
        Intent i = new Intent(this, Perfil.class );
        startActivity(i);
    }

    public void home(View view){
        finish();
    }
}