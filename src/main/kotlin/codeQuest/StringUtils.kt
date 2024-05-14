package org.example.codeQuest

import kotlin.math.pow

class StringUtils {
    /**
     *  Solutions for LeetCode Chapter 1: Array and Strings
     *  This class contains solutions to problems from LeetCode Chapter 1: Array and Strings.
     */
    companion object {
        fun reverseString(s: CharArray): Unit {
            var lowPtr = 0
            var highPtr = s.size - 1

            while (lowPtr < highPtr) {
                val lowValue = s[lowPtr]
                val highValue = s[highPtr]

                val tempLowValue = lowValue
                s[lowPtr] = highValue
                s[highPtr] = tempLowValue

                lowPtr++
                highPtr--
            }
        }

        fun sortedSquares(nums: IntArray): IntArray {
            val list: List<Int> = nums.map { it.toDouble().pow(2.0).toInt() }.sorted()
            return list.toIntArray()
        }

        fun findMaxAverage(nums: IntArray, k: Int): Double {
            if (nums.size == k) {
                val currentSum = nums.sum().toDouble()
                val currentAvg = currentSum / k
                return currentAvg
            }

            var maxAvg = Double.MIN_VALUE
            for (i in 0 until nums.size - k + 1) {
                val currentSum: Double = nums.slice(i until i + k).sum().toDouble()
                val currentAvg = currentSum.div(k)

                maxAvg = maxOf(currentAvg, maxAvg)
            }
            return maxAvg
        }
    }
}