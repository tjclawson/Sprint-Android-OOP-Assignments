package com.example.interfaces.model

class Submarine(id: String = "Submarine", weight: Int = 1, favorite: Boolean = false) : Vehicle(id, weight, favorite), WaterTravel {

    override fun travel(): String {
        return "$id says ${sail()}"
    }

    override fun sail(): String {
        return "I sail underwater"
    }
}