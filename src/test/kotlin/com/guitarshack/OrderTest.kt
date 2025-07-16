package com.guitarshack

import kotlin.test.Test
import kotlin.test.assertEquals

class OrderTest {

    @Test
    fun `addItem - item should be added to the order`() {
        // given
        val order = Order()
        val item = Item()

        // when
        order.addItem(item)

        // then
        assertEquals(1, order.items.size)
    }
}