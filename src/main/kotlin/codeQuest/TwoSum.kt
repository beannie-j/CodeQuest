package org.example.codeQuest

class TwoSum {
    /**
     * Problem Statement: https://leetcode.com/problems/two-sum/description/
     */

    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 1) {
            val currentNum = nums[i]
            for (j in i + 1 until nums.size) {
                val nextIndex = j
                val nextNum = nums[nextIndex]
                println("Index $i: $currentNum, Next Index $nextIndex: $nextNum")

                if (currentNum + nextNum == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val currentNum = nums[i]
            val complement = target - currentNum
            if (map.containsKey(complement)) {
                return intArrayOf(map.getOrDefault(complement, 0), i)
            }
            map[currentNum] = i
        }
        return intArrayOf()
    }
}