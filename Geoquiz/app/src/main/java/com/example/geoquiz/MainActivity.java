package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnVerdadero;
    Button btnFalso;
    Button btnSiguiente;
    TextView textPregunta;

    Pregunta[] preguntas= new Pregunta[]{
            new Pregunta(R.string.pregunta_1, true),
            new Pregunta(R.string.pregunta_2, false),
            new Pregunta(R.string.pregunta_3, true),
            new Pregunta(R.string.pregunta_4, true),
            new Pregunta(R.string.pregunta_5, false),
    };

    int preguntaActual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerdadero = findViewById(R.id.btnverdadero);
        btnFalso = findViewById(R.id.btnfalso);
        btnSiguiente = findViewById(R.id.btnsiguiente);
        textPregunta = findViewById(R.id.text_pregunta);

        Pregunta pregunta = preguntas[preguntaActual];
        textPregunta.setText(pregunta.getId());

        btnVerdadero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Click en btnVerdadero");
                Toast.makeText(MainActivity.this, R.string.correcto, Toast.LENGTH_SHORT).show();
            }
        });
        btnFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Click en btnFalso");
                Toast.makeText(MainActivity.this, R.string.incorrecto, Toast.LENGTH_LONG).show();
            }
        });
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preguntaActual++;
                Pregunta pregunta = preguntas[preguntaActual];
                textPregunta.setText(pregunta.getId());
            }
        });


    }
}