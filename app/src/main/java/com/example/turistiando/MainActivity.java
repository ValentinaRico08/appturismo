package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Atributos

    @Override   //Metodos
    protected void onCreate(Bundle savedInstanceState) { //void no retorna nada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //cargar el menu xml creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);//inflar el menu. R.menu es el xml y ,menu es el java
        return true; //esta retornando el menu
    }

    //Dar funcionamiento al menu
    public boolean onOptionsItemSelected(MenuItem item) {

        //Obsevamos a que item del menu le damos clic
        int itemSeleccionado= item.getItemId();

        switch (itemSeleccionado){

            case(R.id.opcion1):
                Toast.makeText(this, "Seleccionaste opcion 1", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion2):
                Toast.makeText(this, "Seleccionaste opcion 2", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion3):
                Toast.makeText(this, "Seleccionaste opcion 3", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}