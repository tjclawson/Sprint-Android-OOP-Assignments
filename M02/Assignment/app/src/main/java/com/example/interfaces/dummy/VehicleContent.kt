package com.example.interfaces.dummy

import com.example.interfaces.model.*
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object VehicleContent {

    val ITEMS: MutableList<Vehicle> = ArrayList()
    val ITEM_MAP: MutableMap<String, Vehicle> = HashMap()

    init {
        ITEMS.add(Boat())
        ITEMS.add(Blimp())
        ITEMS.add(Car())
        ITEMS.add(Plane())
        ITEMS.add(Submarine())
        ITEMS.add(Wagon())



        ITEM_MAP.put(ITEMS[0].id, ITEMS[0])
        ITEM_MAP.put(ITEMS[1].id, ITEMS[1])
        ITEM_MAP.put(ITEMS[2].id, ITEMS[2])
        ITEM_MAP.put(ITEMS[3].id, ITEMS[3])
        ITEM_MAP.put(ITEMS[4].id, ITEMS[4])
        ITEM_MAP.put(ITEMS[5].id, ITEMS[5])
    }
    /*
    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }

     */
}
