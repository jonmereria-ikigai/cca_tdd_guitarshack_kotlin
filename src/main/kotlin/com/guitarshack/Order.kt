package com.guitarshack

class Order {
    val items: ArrayList<Item> = arrayListOf()

    fun addItem(item: Item) {
        items.add(item)
    }
}