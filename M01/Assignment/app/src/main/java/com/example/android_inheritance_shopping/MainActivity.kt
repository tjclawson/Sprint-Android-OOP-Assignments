package com.example.android_inheritance_shopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shoppingList.add(Book(R.color.book,"The Signal and the Noise", "Non-Fiction"))
        shoppingList.add(Book(R.color.book, "Dune", "Sci-Fi"))
        shoppingList.add(Book(R.color.book, "Foundation", "Sci-Fi"))
        shoppingList.add(Book(R.color.book, "How To Solve It", "Non-Fiction"))
        shoppingList.add(Book(R.color.book, "Godel, Escher, Bach", "Non-Fiction"))
        shoppingList.add(Grocery(R.color.grocery, "Bananas", "Produce"))
        shoppingList.add(Grocery(R.color.grocery, "Oatmeal", "Grain"))
        shoppingList.add(Grocery(R.color.grocery, "Broccoli", "Veg"))
        shoppingList.add(Grocery(R.color.grocery, "Hummus", "Legume"))
        shoppingList.add(Grocery(R.color.grocery, "Sriracha", "Condiments"))
        shoppingList.add(Clothing(R.color.clothing, "Sweater", "Large"))
        shoppingList.add(Clothing(R.color.clothing, "Jeans", "Medium"))
        shoppingList.add(Clothing(R.color.clothing, "Shirt", "Small"))
        shoppingList.add(Clothing(R.color.clothing, "Socks", "XL"))
        shoppingList.add(Clothing(R.color.clothing, "Hoodie", "Large"))

        recyclerview_shopping_list.apply{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ShoppingListAdapter(shoppingList)
        }
    }
}
