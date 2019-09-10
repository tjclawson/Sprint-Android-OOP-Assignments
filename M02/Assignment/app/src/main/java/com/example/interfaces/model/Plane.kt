package com.example.interfaces.model

class Plane (id: String = "Plane", weight: Int = 3, favorite: Boolean = true) : Vehicle(id, weight, favorite), AirTravel{

    override fun travel(): String {
        return "$id says ${flies()}"
    }

    override fun flies(): String {
        return "I fly with wings"
    }

}