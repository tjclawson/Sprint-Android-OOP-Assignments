package com.example.interfaces.model

class Car (id: String = "Car", weight: Int = 6, favorite: Boolean = false) : Vehicle(id, weight, favorite), GroundTravel {

    override fun travel(): String {
        return "$id says ${drive()}"
    }

    override fun drive(): String {
        return "I move by exploding dinosaurs in my engine "
    }

}