package codeQuest

import org.assertj.core.api.Assertions.assertThat
import org.example.codeQuest.TwoSum2
import org.junit.jupiter.api.Test

class TwoSum2Test {

    @Test
    fun testTwoSum_1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(1, 2)
        val actual = TwoSum2.twoSum(nums, target)
        assertThat(actual).containsExactly(*expected)
    }
}