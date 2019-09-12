package com.example.interfaces.model

class Blimp (id: String = "Blimp", weight: Int = 4, favorite: Boolean = false) : Vehicle(id, weight, favorite), AirTravel{

    override fun travel(): String {
        return "$id says ${flies()}"
    }

    override fun flies(): String {
        return "I fly with hot air"
    }

}