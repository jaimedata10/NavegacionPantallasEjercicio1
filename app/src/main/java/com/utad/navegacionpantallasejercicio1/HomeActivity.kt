package com.utad.navegacionpantallasejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Le pones un subtitulo al Título principal de la ventana
        getSupportActionBar()?.setSubtitle("El mejor curso de Android del MUNDO!")
    }
}