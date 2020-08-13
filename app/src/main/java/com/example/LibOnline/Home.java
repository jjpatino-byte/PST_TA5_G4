package com.example.LibOnline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

public class Home extends AppCompatActivity{

    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        contexto=this;
        Button boton = (Button)findViewById(R.id.button7);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                new CuadroDialogo(contexto);
            }
        });
    }



    public void perfil(View view) {
        Intent i = new Intent(this, Perfil.class );
        startActivity(i);
    }

    public void categoria(View view) {
        Intent i = new Intent(this, Categoria.class );
        startActivity(i);
    }

}