package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        //Task 1
        val stringList = mutableListOf<String>("one", "two", "three")
        stringList.add(1) //error because type needs to be string

        //Task 2
        class TypeClass<string: String>()

        val newClass = TypeClass<Int>() //error because TypeClass can only accept strings

        //Task 3
        fun  doubleString(s: String) {
            val dupString = s
            println("$s$dupString")
        }

        doubleString(2) //error because fun doubleString only accepts strings
*/
        //Task 4
        MyString.returnType()

        //Task 5

        //class CellularService

        //class Phone<T: CellularService>(service: CellularService)

        //Task 6
        open class CellularService
        class Verizon: CellularService()
        class TMobile: CellularService()

        class Phone<T: CellularService>(service: CellularService)

        val service = TMobile()
        val newPhone = Phone<CellularService>(service)

        //Task 7
        val observable = Observable.just(1, 2, 3)
        observable.subscribe() {int -> println(int)}

        //Task 8
        data class Actor(val name: String)
        val actorObservable = Observable.just(Actor("Tom Cruise"), Actor("Brad Pitt"))
        actorObservable.subscribe() {actor -> println("Actor: $actor")}


        //Task 9
        val movieList = NetworkAPI.getListOfMovies()
        movieList.subscribe() {movie -> println("$movie")}
    }

    class NetworkAPI {
        companion object {
            fun getListOfMovies(): Observable<List<Movie>> {
                return Observable.just(listOf(
                    Movie("The Place Beyond the Pines", "English", "2012", "10"),
                    Movie("Whiplash", "English", "2014", "8.2"),
                    Movie("La La Land", "English", "2016", "7.9"),
                    Movie("City of God", "Portuguese", "2002", "100000000000000000")
                ))
            }
        }
    }
    data class Movie(val title: String, val language: String, val releaseDate: String, val rating: String)
}

//Task 4
class MyString {
    companion object {
        fun returnType(): String {
            return "string"
        }
    }
}


