package com.example.interfaces.model

class Wagon (id: String = "Wagon", weight: Int = 5, favorite: Boolean = false) : Vehicle(id, weight, favorite), GroundTravel {

    override fun travel(): String {
        return "$id says ${drive()}"
    }

    override fun drive(): String {
        return "I move by something pulling me"
    }

}