package com.utad.navegacionpantallasejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.utad.navegacionpantallasejercicio1.databinding.ActivityHomeBinding.inflate
import com.utad.navegacionpantallasejercicio1.databinding.ActivityMainBinding
import com.utad.navegacionpantallasejercicio1.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonContinuarPantalla2.setOnClickListener {
            // Intent pasa datos a la pantalla siguiente
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("textoUtilizado", binding.txtTextoIntroducido.text.toString())  //Pasar datos a otras pantallas
            startActivity(intent)
        }
    }
}