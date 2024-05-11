package codeQuest

import org.example.codeQuest.MaxProfit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaxProfitTest {

    @Test
    fun testMaxProfit_Case1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_Case2() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_Case3() {
        val prices = intArrayOf(1, 2, 3, 4, 5)
        val expected = 4
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_Case4() {
        val prices = intArrayOf(7, 2, 5, 1, 6, 4)
        val expected = 5
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_Case5() {
        val prices = intArrayOf(3, 2, 6, 5, 0, 3)
        val expected = 4
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_EmptyArray() {
        val prices = intArrayOf()
        val expected = 0
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_OneElement() {
        val prices = intArrayOf(5)
        val expected = 0
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_AllIncreasing() {
        val prices = intArrayOf(1, 2, 3, 4, 5)
        val expected = 4
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_AllDecreasing() {
        val prices = intArrayOf(5, 4, 3, 2, 1)
        val expected = 0
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }

    @Test
    fun testMaxProfit_UniqueMinAndMax() {
        val prices = intArrayOf(1, 7, 2, 5, 8)
        val expected = 7
        val actual = MaxProfit.maxProfit(prices)
        assertEquals(expected, actual)
    }
}