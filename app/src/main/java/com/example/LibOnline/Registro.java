package com.example.LibOnline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText et1, et2, et3, et4, et5, et6, et7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        et1 = (EditText)findViewById(R.id.editTextTextPersonName2);
        et2 = (EditText)findViewById(R.id.editTextTextPersonName3);
        et3 = (EditText)findViewById(R.id.editTextTextPersonName4);
        et4 = (EditText)findViewById(R.id.editTextTextPassword2);
        et5 = (EditText)findViewById(R.id.editTextTextEmailAddress);
        et6 = (EditText)findViewById(R.id.editTextPhone);
        et7 = (EditText)findViewById(R.id.editTextTextPersonName5);
    }

    public void registroFinalizado(View view){
        Usuario user = new Usuario(this,
                "administracion", null, 1);
        SQLiteDatabase bd = user.getWritableDatabase();
        String fname = et1.getText().toString();
        String sname = et2.getText().toString();
        String use = et3.getText().toString();
        String pass = et4.getText().toString();
        String correo = et5.getText().toString();
        String celular =et6.getText().toString();
        String catFav = et7.getText().toString();

        if(fname.isEmpty()||sname.isEmpty()||use.isEmpty()||pass.isEmpty()||correo.isEmpty()||celular.isEmpty()||catFav.isEmpty()){
            Toast.makeText(this, "Complete todos los campos",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        Cursor fila = bd.rawQuery(
                "select userName, mail from usuarios where userName = '" + use +"' or mail = '"+ correo +"'", null);
        if (fila.moveToFirst()) {
            Toast.makeText(this, "Usuario o correo ya estan siendo utilizados.",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        bd.execSQL("insert into usuarios (codigo,userName,password,fName,sName,mail,cell,favGenre) values (autoincrement,"+use+","+pass+","+fname+","+sname+","+correo+","+celular+","+catFav+")");
        bd.close();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
        et6.setText("");
        et7.setText("");
        Toast.makeText(this, "Registro exitoso.",
                Toast.LENGTH_SHORT).show();
        finish();
    }
}