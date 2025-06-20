package com.example.apppeliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apppeliculas.databinding.ItemPeliculaBinding
import com.example.apppeliculas.model.Pelicula

class PeliculaAdapter(private val peliculas: List<Pelicula>) :
    RecyclerView.Adapter<PeliculaAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemPeliculaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemPeliculaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.binding) {
        val peli = peliculas[position]
        tvTitulo.text = peli.titulo
        tvAnio.text = peli.anio
        tvResenia.text = peli.resenia
        tvGenero.text = peli.genero.name
        tvPuntuacion.text = "${peli.puntuacion}/5"
    }

    override fun getItemCount() = peliculas.size
}
