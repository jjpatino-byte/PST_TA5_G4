package com.example.Libros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
        textView2 = (TextView)findViewById(R.id.textView2);
    }

    public void inicio(View view) {
        ImageView iv1 = (ImageView)findViewById(R.id.imageView2);
        TextView tv1 = (TextView)findViewById(R.id.textView);
        TextView tv2 = (TextView)findViewById(R.id.textView3);
        TextView tv3 = (TextView)findViewById(R.id.textView4);
        EditText et1 = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText et2 = (EditText)findViewById(R.id.editTextTextPassword);
        Intent i = new Intent(this, login.class );
        startActivity(i);
    }

}