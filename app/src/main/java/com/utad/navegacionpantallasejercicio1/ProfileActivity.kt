package com.utad.navegacionpantallasejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.inflate
import com.utad.navegacionpantallasejercicio1.databinding.ActivityMainBinding
import com.utad.navegacionpantallasejercicio1.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Recibe los datos de la pantalla anterior
        val textoUtilizado = intent.extras?.getString("textoUtilizado")

        binding.txtQuePasamos.text = textoUtilizado

        binding.buttonIrHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}