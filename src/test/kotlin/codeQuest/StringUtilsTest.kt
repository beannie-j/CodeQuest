package codeQuest

import org.example.codeQuest.StringUtils.Companion.findMaxAverage
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringUtilsTest {
    @Test
    fun testFindMaxAverage() {
        val nums = intArrayOf(4, 0, 4, 3, 3)
        val k = 5
        val expected = 14.0
        val actual = findMaxAverage(nums, k)
        val delta = 0.00001 // Define a small delta for comparing double values
        assertEquals(expected, actual, delta)
    }

    @Test
    fun testFindMaxAverageExample1() {
        val nums = intArrayOf(1, 12, -5, -6, 50, 3)
        val k = 4
        val expected = 12.75
        val actual = findMaxAverage(nums, k)
        val delta = 0.00001 // Define a small delta for comparing double values
        assertEquals(expected, actual, delta)
    }

    @Test
    fun testFindMaxAverageExample2() {
        val nums = intArrayOf(5)
        val k = 1
        val expected = 5.0
        val actual = findMaxAverage(nums, k)
        val delta = 0.00001 // Define a small delta for comparing double values
        assertEquals(expected, actual, delta)
    }

    @Test
    fun testFindMaxAverageSingleElement() {
        val nums = intArrayOf(-1)
        val k = 1
        val expected = -1.0
        val actual = findMaxAverage(nums, k)
        val delta = 0.00001 // Define a small delta for comparing double values
        assertEquals(expected, actual, delta)
    }

    @Test
    fun testFindMaxAverageExample3() {
        val nums = intArrayOf(4, 0, 4, 3, 3)
        val k = 5
        val expected = 2.80000
        val actual = findMaxAverage(nums, k)
        val delta = 0.00001 // Define a small delta for comparing double values
        assertEquals(expected, actual, delta)
    }
}