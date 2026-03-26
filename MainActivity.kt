package com.example.appaudioramses

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.TextView
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.content.Intent
import android.os.Looper
import android.os.Handler


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Agregar animaciones
        val animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba)



        val animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba)

        //val animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo)
        //val animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo)

        val audiotextView = findViewById<TextView>(R.id.audiotextView)
        val logoimageview = findViewById<ImageView>(R.id.logoimageview)

        audiotextView.animation = animacion1
        logoimageview.animation = animacion2
        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, ViewActivity::class.java)
            startActivity(intent)
            finish()

        },4000)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
