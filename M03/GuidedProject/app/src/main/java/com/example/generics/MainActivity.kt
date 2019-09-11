package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1: list of strings
        //Kotlin's type inferece can deduce that this is a list of strings from the properties we added

        val listOfStrings = mutableListOf<String>("a", "b", "c")
        //listOfStrings.add(1) //this gives an error because it only accepts strings

        // TODO 2: Create a class

        class Box<T> {

            private  var contents: T? = null
            fun put(t: T){
                contents = t
            }

            fun get(): T? {
                return contents
            }
        }

        //because we made the box class generic, we can use it for multiple data types

        val stringBox = Box<String>()
        stringBox.put("a string")
        //stringBox.put(1) //this gives error because once we set the type (line above) it cannot be changed
        println(stringBox.get())

        val intBox = Box<Int>()
        intBox.put(1)
        println(intBox.get())
    }
}
