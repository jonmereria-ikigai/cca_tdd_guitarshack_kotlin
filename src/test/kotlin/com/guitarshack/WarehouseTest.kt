package com.guitarshack

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WarehouseTest {

    @Test
    fun `test add product stock to warehouse`() {
        val warehouse = Warehouse()
        warehouse.addItem("PRODUCT1", 2)
        assertEquals(2, warehouse.checkQuantity("PRODUCT1"))
    }

    @Test
    fun `test adjust or deduct product stock quantity in warehouse`() {

    }
}