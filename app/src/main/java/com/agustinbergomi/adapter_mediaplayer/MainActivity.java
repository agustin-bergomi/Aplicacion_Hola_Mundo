package com.agustinbergomi.adapter_mediaplayer;

// En esta aplicacion voy a mostrar algunas funcionalidades y codigo util para hacer aplicaciones android. Es mas que nada conceptual. Cualquier duda dejar comentarios.

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    Se declara una variable de tipo TextView.
    TextView saludo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Se inicializa variable saludo1 con un text view.
//        El text view es un recurso por eso se lo llama con findView..
//        Se lo debe castear a TextView porque al llamarlo por id estamos refiriendonos a un int pero dijimos que saludo1 es de tipo TextView.
        saludo1 = (TextView) findViewById(R.id.tv_saludo);
//        llamamos al metodo mostrar texto.
//        esto lo estamos haciendo en el on Create que es lo primero que se ejecuta.
        mostrarTexto();
    }

//    por fuera del oncreate pero en la main activity declaramos un metodo.
//    el metodo al ser llamado aplica el metodo setText sobre la variable textView saludo1.
    public void mostrarTexto(){
        saludo1.setText("Hola mundo!");
    }
}

