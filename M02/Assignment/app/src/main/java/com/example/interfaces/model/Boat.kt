package com.example.interfaces.model

class Boat (id: String = "Boat", weight: Int = 2, favorite: Boolean = false) : Vehicle(id, weight, favorite), WaterTravel {

    override fun travel(): String {
        return "$id says ${sail()}"
    }

    override fun sail(): String {
        return "I sail on top of the water"
    }

}