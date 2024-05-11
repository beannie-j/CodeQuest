package codeQuest

import org.assertj.core.api.Assertions.assertThat
import org.example.codeQuest.TwoSum
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TwoSumTest {

    private lateinit var twoSum: TwoSum

    @BeforeEach
    fun setUp() {
        twoSum = TwoSum()
    }

    @Test
    fun testTwoSum_1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_2() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val expected = intArrayOf(1, 2)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_3() {
        val nums = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_4() {
        val nums = intArrayOf(0, 4, 3, 0)
        val target = 0
        val expected = intArrayOf(0, 3)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_5() {
        val nums = intArrayOf(-1, -2, -3, -4, -5)
        val target = -8
        val expected = intArrayOf(2, 4)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_6() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val target = 10
        val expected = intArrayOf(3, 4)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_7() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val target = 2
        val expected = intArrayOf(0, 1)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_8() {
        val nums = intArrayOf(1, 2)
        val target = 3
        val expected = intArrayOf(0, 1)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_9() {
        val nums = intArrayOf(1)
        val target = 1
        val expected = intArrayOf(0)
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }

    @Test
    fun testTwoSum_10() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val target = 20
        val expected = intArrayOf()
        val actual = twoSum.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }
}
