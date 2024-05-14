package org.example.codeQuest

class BinarySearch {

    companion object {
        fun search(nums: IntArray, target: Int): Int {
            if (nums.size == 1) {
                val i = nums.firstOrNull()
                return if (i == target) {
                    0
                } else {
                    -1
                }
            }

            var leftPtr = 0
            var rightPtr = nums.size - 1

            while (leftPtr <= rightPtr) {
                val midPtr = (leftPtr + rightPtr) / 2
                val midValue = nums[midPtr]

                if (midValue == target) {
                    return midPtr
                } else if (midValue < target) {
                    leftPtr = midPtr + 1
                } else {
                    rightPtr = midPtr - 1
                }

            }
            return -1
        }
    }
}