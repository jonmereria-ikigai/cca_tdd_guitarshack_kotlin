package com.guitarshack

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ShippingTest {
    @Test
    fun shippingPriceToUkForOrderLessThan120() {
        val shipping  = Shipping()
        assertEquals(9.99, shipping.calculateForOrder("United_Kingdom", 100.0))
    }
}