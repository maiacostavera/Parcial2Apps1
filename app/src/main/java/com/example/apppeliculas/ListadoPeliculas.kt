package com.example.apppeliculas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apppeliculas.adapter.PeliculaAdapter
import com.example.apppeliculas.databinding.ActivityListadoPeliculasBinding
import com.example.apppeliculas.model.Pelicula

class ListadoPeliculas : AppCompatActivity() {

    private lateinit var binding: ActivityListadoPeliculasBinding // se declara la variable de binding
    private val listaPeliculas = mutableListOf<Pelicula>() // es para almacenar las películas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        binding = ActivityListadoPeliculasBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.rvPeliculas.layoutManager = LinearLayoutManager(this)


        val nuevaPelicula = intent.getParcelableExtra<Pelicula>("KEY_PELICULA")

        nuevaPelicula?.let {
            listaPeliculas.add(it)
        }

        val peliculaAdapter = PeliculaAdapter(listaPeliculas)
        binding.rvPeliculas.adapter = peliculaAdapter


    }
}