package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona = new Persona();
        //persona = referencia en memoria
        //declaracion = asignacion|instancia(si esta la palabra new es una instancia, si no una asignacion)

        persona.nombre="Joseph";
        persona.apellido="Parra";

        Alumno alumno = new Alumno();

        alumno.codigoMatricula="001A";
        alumno.apellido="Parra";
        alumno.nombre="Joseph";

        Persona per1 = new Alumno();
        //Alumno alu2 = new Persona();
        per1=(Alumno)alu;


    }
}