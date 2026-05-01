package com.example.ifoodgithub

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ifoodgithub.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {

private val binding by lazy {
    ActivityLoginBinding.inflate(layoutInflater)
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnChamaRestaurante.setOnClickListener {

            // startActivity(Intent(this, Restaurantes::class.java))

            Toast.makeText(this, "Chama Tela Restaurantes", Toast.LENGTH_SHORT).show()
        }
    }
}