package com.example.ifoodgithub

import android.content.Intent
import android.net.http.UrlRequest
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ifoodgithub.databinding.ActivityRestaurantesBinding

class Restaurantes : AppCompatActivity() {

  private val binding by lazy {
     ActivityRestaurantesBinding.inflate(layoutInflater)
  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        title = "Restaurantes"

        binding.imgMcDonalds.setOnClickListener {
            Toast.makeText(this,
                "Mc Donalds não disponível no momento",
                Toast.LENGTH_SHORT)
                .show()
        }

        binding.imgBk.setOnClickListener {
            //Aguardando implementação
            startActivity(Intent(this, DetalheRestauranteActivity::class.java))
        }


        binding.imgOutback.setOnClickListener{

            //Aguardando implementação
            Toast.makeText(this,
                "Outback não disponível no momento",
                Toast.LENGTH_SHORT)
                .show()
        }



    }
}