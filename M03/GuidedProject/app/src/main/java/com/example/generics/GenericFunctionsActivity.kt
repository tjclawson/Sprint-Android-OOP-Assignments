package com.example.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class GenericFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic_functions)

        //val mySingleList = singleList("a") //causing error until we change singleList to generic
    }

    //put exported under this activity in the manifest, allows us to just run this activity by right clicking
    override fun onStart() {
        super.onStart()
        val mySingleList = singleList("a")
        val myOtherList = singleList(1)
        Toast.makeText(this, "Our single list contains ${mySingleList[0]}\n " +
                "our Other list contains ${myOtherList[0]}", Toast.LENGTH_LONG).show()
    }

    fun <T> singleList(t: T): List<T> {
        val theList = ArrayList<T>()
        theList.add(t)
        return theList
    }

    fun <T, E> doubleList(t: T, e: E): Map<T, E> {
        val theList = mutableMapOf<T, E>()
        theList[t] = e
        return theList
    }

    class Box<T>(private var item: T) {

        var open = false

        fun fetch(): T? {
            return item.takeIf { open }
        }
    }
}
