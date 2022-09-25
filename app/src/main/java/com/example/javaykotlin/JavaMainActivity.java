package com.example.javaykotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class JavaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMAJ = findViewById(R.id.buttonJava);

        buttonMAJ.setOnClickListener(v -> {

            /* Declaramos un objeto intent, una abstracción de la intención de cambiar de actividad.
            Este método recibe:
                - El contexto de partida: la activity en que está. Utilizamos ".this" para
                referirnos al objeto de la clase que encierra (enclosing) nuestra clase anónima.
                - La clase de la Activity que ha de ser creada. Como esta activity todavía no se puede
                instaciar, se usa la sintaxis .class (reflection).
            */
            Intent intent = new Intent(JavaMainActivity.this, KotlinMainActivity.class);

            /* Llamamos al método que inicia una activity a partir del intent */
            startActivity(intent);

        });
    }
}