package org.example.codeQuest

class TwoSum2 {
    companion object {
        /**
         * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
         */
        fun twoSum(numbers: IntArray, target: Int): IntArray {
            val numberIndexMap = mutableMapOf<Int, Int>()

            for (i in numbers.indices) {
                val currentNum = numbers[i]
                val complement = target - currentNum

                if (numberIndexMap.containsKey(complement)) {
                    return intArrayOf(numberIndexMap.getOrDefault(complement, 0) + 1, i + 1)
                }
                numberIndexMap[currentNum] = i
            }
            return intArrayOf()
        }
    }
}