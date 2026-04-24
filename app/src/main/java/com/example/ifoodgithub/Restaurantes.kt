package com.example.ifoodgithub

import android.net.http.UrlRequest
import android.os.Bundle
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



    }
}