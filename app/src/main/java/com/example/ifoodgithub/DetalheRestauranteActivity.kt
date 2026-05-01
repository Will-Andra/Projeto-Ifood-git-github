package com.example.ifoodgithub

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ifoodgithub.databinding.ActivityDetalheRestauranteBinding

class DetalheRestauranteActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalheRestauranteBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        title = "Detalhe do Restaurante"

        binding.textVoltaRestaurante.setOnClickListener {
            startActivity(Intent(this, Restaurantes::class.java))
            finish()
        }

        binding.txtHamburger .setOnClickListener {
            startActivity(Intent(this, DetalheProdutoActivity::class.java))
        }
    }
}