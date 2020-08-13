package com.example.LibOnline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void logIn(View view) {
        EditText et1 = (EditText)findViewById(R.id.busqueda);
        Intent i = new Intent(this, Home.class );
        startActivity(i);
    }

    public void registro(View view){

        Intent i = new Intent(this, Registro.class );
        startActivity(i);
    }
}