package com.example.identificador; // Verifica que coincida con tu paquete

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
    }

    // Método asignado al botón Regresar en el atributo onClick del XML
    public void acceptButton(View view) {
        Intent intent = new Intent(Resultado.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
