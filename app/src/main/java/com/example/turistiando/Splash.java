package com.example.turistiando;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    //Atributos
    //Crear una variable para que me almacene la cancion
    //Se crea la clase con el objeto
    MediaPlayer cancion;


    //Estos son los metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Cuando se conecte con el xml me oculte el action bar
        ActionBar barra = getSupportActionBar();
        barra.hide(); //hide es un atributo para que se esconda la barra

        //Lanzar la canción
        cancion = MediaPlayer.create(this,R.raw.cancion); //Se carga la cancion
        cancion.start(); //Se pone a sonar

        //Temporizar la duración del splash
        TimerTask inicioapp = new TimerTask() {
            @Override //Sobreescribir un metodo
            public void run() {

                //Lanzar una nueva actividad
                Intent intent = new Intent(Splash.this,MainActivity.class); //Al lugar donde quiero ir
                startActivity(intent);
            }
        };

        //se coloca el tiempo
        Timer tiempo = new Timer();
        tiempo.schedule(inicioapp, 10000); //El tiempo que se demora en iniciar la app

    }















}