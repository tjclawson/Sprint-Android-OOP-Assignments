package com.example.interfaces.model

abstract class Vehicle (
    open val id: String,
    open val weight: Int,
    open var favorite: Boolean
) {
    abstract fun travel(): String
}

interface AirTravel {

    fun flies(): String
}

interface WaterTravel {

    fun sail(): String
}

interface GroundTravel {

    fun drive(): String
}