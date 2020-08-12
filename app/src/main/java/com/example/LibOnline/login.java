package com.example.LibOnline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        TextView tv1 = (TextView)findViewById(R.id.textView5);
        EditText et1 = (EditText)findViewById(R.id.busqueda);
        ScrollView sv1= (ScrollView)findViewById(R.id.scrollView2);
        Intent i = new Intent(this, Home.class );
        startActivity(i);
    }
}