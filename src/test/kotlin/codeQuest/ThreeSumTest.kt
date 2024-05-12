import org.assertj.core.api.Assertions.assertThat
import org.example.codeQuest.ThreeSum
import org.junit.jupiter.api.Test

class ThreeSumTest {

    @Test
    fun testThreeSum_Example1() {
        val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }

    @Test
    fun testThreeSum_Example2() {
        val nums = intArrayOf()
        val expected = emptyList<List<Int>>()
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }

    @Test
    fun testThreeSum_Example3() {
        val nums = intArrayOf(0)
        val expected = emptyList<List<Int>>()
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }

    @Test
    fun testThreeSum_AllZeroes() {
        val nums = intArrayOf(0, 0, 0, 0, 0)
        val expected = listOf(listOf(0, 0, 0))
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }

    @Test
    fun testThreeSum_PositiveAndNegative() {
        val nums = intArrayOf(-1, -2, 1, 2, -3, 3)
        val expected = listOf(listOf(-3, 1, 2), listOf(-2, -1, 3))
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }

    @Test
    fun testThreeSum_Duplicates() {
        val nums = intArrayOf(0, 0, 0, 0)
        val expected = listOf(listOf(0, 0, 0))
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }

    @Test
    fun testThreeSum_PositiveOnly() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = emptyList<List<Int>>()
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }

    @Test
    fun testThreeSum_NegativeOnly() {
        val nums = intArrayOf(-1, -2, -3, -4, -5)
        val expected = emptyList<List<Int>>()
        val result = ThreeSum.threeSum(nums)
        assertThat(result).containsExactlyElementsOf(expected)
    }
}
