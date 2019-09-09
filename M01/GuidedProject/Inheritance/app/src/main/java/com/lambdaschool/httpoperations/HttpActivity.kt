package com.lambdaschool.httpoperations

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lambdaschool.httpoperations.retrofit.JsonPlaceHolderApi
import kotlinx.android.synthetic.main.activity_http_get.*

// TODO 1: Look at Http<Op>Activity classes for behavior to extract
abstract open class HttpActivity : AppCompatActivity() {
    lateinit var jsonPlaceHolderApi: JsonPlaceHolderApi

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initializeApi()
    }

    open fun initializeApi() {
        jsonPlaceHolderApi = JsonPlaceHolderApi.Factory.create()
    }

    open fun onFailure(throwable: Throwable) {
        progressBar.visibility = View.GONE
        result.text = throwable.toString()
        doThePrivateThing()
    }

    //this private fun can be put in an open fun and it will do the thing, but it cannot be called, if we make it public and then try to override,
    //we can't because it is final by default, so it needs to be open to be overriden in a subclass
    private fun doThePrivateThing() {
        Log.i("HttpActivity", "Do the private thing")
    }
}

// TODO 2: Define a parent class in this file called HttpActivity that extracts it

// TODO 3: Derive the Http<Op>Activity classes from HttpActivity

// TODO 4: Notice the effect of qualifiers like open override, etc.

