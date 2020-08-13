package com.example.LibOnline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
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
        //baseD();
    }
/*
    public void baseD(){
        Libros libreria = new Libros(this,
                "administracion", null, 1);
        SQLiteDatabase bd = libreria.getWritableDatabase();
        bd.execSQL("insert into libros (codigo,titulo,autor,editorial,categoria,descripcion) " +
                "values ('1','It','Stephen King','Viking Press','Terror','It es una novela de terror publicada en 1986 por el escritor estadounidense Stephen King. Cuenta la historia de un grupo de siete niños que son aterrorizados por un malvado monstruo -al que llaman «Eso»- que es capaz de cambiar de forma, alimentándose del terror que produce en sus víctimas.' )," +
                "('2','Dracula','Bram Stoker','Porrúa','Terror','Drácula es una novela publicada en 1897 por el irlandés Bram Stoker, quien ha convertido a su protagonista en el vampiro más famoso.  La novela, escrita de manera epistolar, presenta otros temas, como el papel de la mujer en la época victoriana, la sexualidad, la inmigración, el colonialismo o el folclore.')," +
                "('3','La llamada de Cthulhu','H.P. Lovecraft','Weird Tales','Terror','La llamada de Cthulhu (The Call of Cthulhu en inglés) es un relato corto en estructura de novelette escrito por H. P. Lovecraft en el año 1926. Cthulhu hace su primera aparición en este relato, convirtiéndose en una figura central del ciclo literario de los Mitos de Cthulhu.')," +
                "('4','Hamlet','William Shakespeare','Alianza','Tragedia','Hamlet, es una tragedia del dramaturgo inglés William Shakespeare. Su autor probablemente basó Hamlet en dos fuentes: la leyenda de Amleth y una perdida obra isabelina conocida hoy como Ur-Hamlet o Hamlet original.')," +
                "('5','Edipo Rey','Sofocles','Lucina','Tragedia','Edipo rey es una tragedia griega de Sófocles, de fecha desconocida. Algunos indicios dicen que pudo ser escrita en los años posteriores a 430 a. C. y que fue representada por primera vez alrededor del año 429 a. C.')," +
                "('6','Romeo y Julieta','William Shakespeare','Alianza','Tragedia','Cuenta la historia de dos jóvenes enamorados que, a pesar de la oposición de sus familias, rivales entre sí, deciden casarse de forma clandestina y vivir juntos; sin embargo, la presión de esa rivalidad y una serie de fatalidades conducen a que la pareja elija el suicidio antes que vivir separados.')," +
                "('7','La sombra del viento','Carlos Ruiz Zafón','Planeta','Misterio','[Barcelona,1945]. El pequeño Daniel Sempere llega a El Cementerio de los Libros Olvidados de la mano de su padre. Allí escoge un libro llamado La sombra del viento, escrito por Julián Carax, mientras crece e interesado en conocer más de este indescifrable autor, va investigando y descubre que todos sus libros han sido misteriosamente quemados por uno de los personajes del libro.')," +
                "('8','Los crímenes de la calle Morgue','Edgar Allan Poe','Graham`s Magazine','Misterio','Se produce el bárbaro asesinato de dos mujeres, madame L`Espanaye y mademoiselle Camille L`Espanaye, madre e hija, en un apartamento de una populosa calle de París. Las primeras pesquisas que lleva a cabo la brigada de investigaciones de la policía no dan resultado alguno, evidenciándose la impotencia de la misma para esclarecer los hechos.')," +
                "('9','El sabueso de los Baskerville','Arthur Conan Doyle','George Newnes','Misterio','La historia transcurre en 1889 cuando Sir Charles Baskerville es encontrado muerto en un sendero en el páramo de Devonshire, el doctor Mortimer acude a Londres para buscar la ayuda de Sherlock Holmes: lee a Holmes el manuscrito acerca de la maldición de los Baskerville, supuestamente iniciada con Hugo de Baskerville, matado por un sabueso infernal como castigo por su maldad.')");
        bd.close();
    }
    */

    public void inicio(View view) {
        ImageView iv1 = (ImageView)findViewById(R.id.imageView2);
        TextView tv1 = (TextView)findViewById(R.id.textView);
        TextView tv2 = (TextView)findViewById(R.id.textView3);
        TextView tv3 = (TextView)findViewById(R.id.textView4);
        TextView tv4 = (TextView)findViewById(R.id.textView6);
        EditText et1 = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText et2 = (EditText)findViewById(R.id.editTextTextPassword);
        Button bt1 = (Button) findViewById(R.id.button);
        Button bt2 = (Button)findViewById(R.id.button2);
        Intent i = new Intent(this, login.class );
        startActivity(i);
    }

}