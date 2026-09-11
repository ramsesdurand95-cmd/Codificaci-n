package com.example.identificador; // Verifica que coincida con tu paquete

import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private FingerprintManager fingerprintManager;
    private FingerprintManager.AuthenticationCallback authenticationCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlace de vistas con layout XML
        textView = findViewById(R.id.textView2); // Asegúrate que el ID coincida con tu XML
        imageView = findViewById(R.id.imageView);

        // Inicialización del servicio biométrico
        fingerprintManager = (FingerprintManager) getSystemService(FINGERPRINT_SERVICE);

        // Configuración de los 4 métodos de respuesta biométrica
        authenticationCallback = new FingerprintManager.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
                textView.setText("ERROR: Intente de nuevo");
                imageView.setImageResource(R.drawable.failed);
            }

            @Override
            public void onAuthenticationHelp(int helpCode, CharSequence helpString) {
                super.onAuthenticationHelp(helpCode, helpString);
                textView.setText("AYUDA: Vuelve a escanear de nuevo");
                imageView.setImageResource(R.drawable.cargando);
            }

            @Override
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                textView.setText("¡Escaneo de huella dactilar exitoso! \nIniciando sesión…");
                imageView.setImageResource(R.drawable.correct);
                
                // Transición a la pantalla de bienvenida
                startActivity(new Intent(MainActivity.this, Resultado.class));
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                textView.setText("Escaneo fallido, huella dactilar no registrada");
                imageView.setImageResource(R.drawable.failed);
            }
        };
    }

    // Método asignado al botón de escaneo en el atributo onClick del XML
    public void scanButton(View view) {
        if (fingerprintManager != null) {
            try {
                fingerprintManager.authenticate(null, null, 0, authenticationCallback, null);
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }
}
