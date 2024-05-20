package codeQuest

import org.example.codeQuest.MaxHeap.Companion.connectSticks
import org.example.codeQuest.MaxHeap.Companion.minStoneSum
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinStoneSumTest {
    @Test
    fun testExample1() {
        val piles = intArrayOf(5, 4, 9)
        val k = 2
        val result = minStoneSum(piles, k)
        assertEquals(12, result)
    }

    @Test
    fun testExample2() {
        val piles = intArrayOf(4, 3, 6, 7)
        val k = 3
        val result = minStoneSum(piles, k)
        assertEquals(12, result)
    }

    @Test
    fun testSinglePile() {
        val piles = intArrayOf(10)
        val k = 5
        val result = minStoneSum(piles, k)
        assertEquals(0, result)
    }

    @Test
    fun testEmptyPiles() {
        val piles = intArrayOf()
        val k = 0
        val result = minStoneSum(piles, k)
        assertEquals(0, result)
    }

    @Test
    fun `test example 1`() {
        val sticks = intArrayOf(2, 4, 3)
        val expectedResult = 14
        val result = connectSticks(sticks)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `test example 2`() {
        val sticks = intArrayOf(1, 8, 3, 5)
        val expectedResult = 30
        val result = connectSticks(sticks)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `test example 3`() {
        val sticks = intArrayOf(5)
        val expectedResult = 0
        val result = connectSticks(sticks)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `test empty sticks`() {
        val sticks = intArrayOf()
        val expectedResult = 0
        val result = connectSticks(sticks)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `test sticks with one stick`() {
        val sticks = intArrayOf(10)
        val expectedResult = 0
        val result = connectSticks(sticks)
        assertEquals(expectedResult, result)
    }
}