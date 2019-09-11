package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class GenericsAPIOperationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generics_apioperations)
    }

    override fun onStart() {
        super.onStart()

        val observable = Observable.just("alpha", "beta", "gamma", "delta")

        //this will print out all the items in the observable
        observable.subscribe() {string -> println("the observable returned $string")}

        open class Person
        class Mark: Person()
        class Alan: Person()

        val personObservable = Observable.just(Mark(), Alan())

        personObservable.subscribe() {person -> println("The observable returned $person")}
    }

    open class Person
    class Mark: Person()
    class Alan: Person()


    //fake API
    class NetworkAPI {
        companion object {
            fun getListOfPeople(): Observable<List<Person>> {
                return Observable.just(listOf(Mark(), Alan()))
            }
        }
    }
}
