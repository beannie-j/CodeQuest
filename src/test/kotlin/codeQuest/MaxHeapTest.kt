package codeQuest

import org.example.codeQuest.MaxHeap.Companion.lastStoneWeightUsingList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaxHeapTest {
    @Test
    fun testExample1() {
        val weights = arrayOf(1, 2, 3, 6, 7, 7)
        val result = lastStoneWeightUsingList(weights)
        assertEquals(0, result)
    }

    @Test
    fun testExample2() {
        val weights = arrayOf(2, 7, 4, 1, 8, 1)
        val result = lastStoneWeightUsingList(weights)
        assertEquals(1, result)
    }

    @Test
    fun testSingleStone() {
        val weights = arrayOf(3)
        val result = lastStoneWeightUsingList(weights)
        assertEquals(3, result)
    }

    @Test
    fun testTwoEqualStones() {
        val weights = arrayOf(5, 5)
        val result = lastStoneWeightUsingList(weights)
        assertEquals(0, result)
    }

    @Test
    fun testTwoDifferentStones() {
        val weights = arrayOf(8, 10)
        val result = lastStoneWeightUsingList(weights)
        assertEquals(2, result)
    }

    @Test
    fun testNoStones() {
        val weights = arrayOf<Int>()
        val result = lastStoneWeightUsingList(weights)
        assertEquals(0, result)
    }
}