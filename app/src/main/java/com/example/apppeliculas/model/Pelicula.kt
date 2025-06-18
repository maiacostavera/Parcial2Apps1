package com.example.apppeliculas.model

enum class Genero {
    ACCION, COMEDIA, DRAMA, DOCUMENTAL, OTRO
}


data class Pelicula(
    //val id: Int = generarIdUnico(),
    var titulo: String,
    var anio: String,
    var resenia: String,
    var genero: Genero,
    var puntuacion: Int // entre 0 y 5
)
