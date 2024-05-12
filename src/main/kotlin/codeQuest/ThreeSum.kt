package org.example.codeQuest

import java.util.*

class ThreeSum {
    companion object {
        /**
         * https://leetcode.com/problems/3sum/
         */
        fun threeSum(nums: IntArray): List<List<Int>> {
            Arrays.sort(nums)

            val result: MutableSet<List<Int>> = mutableSetOf()


            for (i in nums.indices) {
                val currentNum = nums[i]
                var lowPtr = i + 1
                var highPtr = nums.size - 1

                while (lowPtr < highPtr) {
                    val lowValue = nums[lowPtr]
                    val highValue = nums[highPtr]

                    val currentSum = currentNum + lowValue + highValue

                    when {
                        currentSum == 0 -> {
                            result.add(listOf(currentNum, lowValue, highValue))
                            lowPtr++
                            highPtr--
                        }

                        currentSum < 0 -> {
                            lowPtr++
                        }

                        else -> highPtr--
                    }
                }
            }

            return result.toList()
        }
    }
}