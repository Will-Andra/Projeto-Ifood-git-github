package com.example.ifoodgithub

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ifoodgithub.databinding.ActivityDetalheProdutoBinding

class DetalheProdutoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalheProdutoBinding.inflate(layoutInflater)
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

        binding.btnAdicionar.setOnClickListener {
            startActivity(Intent(this,ConfirmacaoActivity::class.java))
        }

        binding.fabVoltar.setOnClickListener {
            finish()
        }
    }
}