package codeQuest

import org.example.codeQuest.BinarySearch.Companion.search
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTest {

    @Test
    fun testExistingTarget1() {
        val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 9
        val expected = 4
        val actual = search(nums, target)
        assertEquals(expected, actual)
    }

    @Test
    fun testExistingTarget2() {
        val nums = intArrayOf(2, 5)
        val target = 5
        val expected = 1
        val actual = search(nums, target)
        assertEquals(expected, actual)
    }

    @Test
    fun testNonExistingTarget() {
        val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 2
        val expected = -1
        val actual = search(nums, target)
        assertEquals(expected, actual)
    }

    @Test
    fun testEmptyArray() {
        val nums = intArrayOf()
        val target = 5
        val expected = -1
        val actual = search(nums, target)
        assertEquals(expected, actual)
    }

    @Test
    fun testSingleElementArray() {
        val nums = intArrayOf(5)
        val target = 5
        val expected = 0
        val actual = search(nums, target)
        assertEquals(expected, actual)
    }

}
