package com.guitarshack

class Warehouse {
    private val items = mutableMapOf<String, Int>()

    fun addItem(productName: String, quantity: Int) {
        items[productName] = quantity
    }

    fun checkQuantity(productName: String): Int? {
        return this.items.get(productName)
    }

}
