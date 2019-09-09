package com.example.android_inheritance_shopping

open class ShoppingItem (val colorId: Int, val productName: String) {

    open fun getDisplayName(): String {
        return "Product: $productName"
    }
}

class Grocery(colorId: Int = R.color.grocery, productName: String, val type: String): ShoppingItem(colorId, productName) {

    override fun getDisplayName(): String {
        return super.getDisplayName() + "Type: $type"
    }
}

class Clothing(colorId: Int = R.color.clothing, productName: String, val size: Int): ShoppingItem(colorId, productName) {

    override fun getDisplayName(): String {
        return super.getDisplayName() + "Size: $size"
    }
}

class Book(colorId: Int = R.color.book, productName: String, val genre: String): ShoppingItem(colorId, productName) {

    override fun getDisplayName(): String {
        return super.getDisplayName() + "Genre: $genre"
    }
}