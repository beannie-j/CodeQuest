package org.example.codeQuest

import java.util.*
import kotlin.math.abs
import kotlin.math.floor

class MaxHeap {
    companion object {
        fun lastStoneWeight(weights: Array<Int>): Int {
            val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
            maxHeap.addAll(weights.toList())

            while (maxHeap.size > 1) {
                val first = maxHeap.poll()
                val second = maxHeap.poll()

                if (first != second) {
                    maxHeap.add(abs(first - second))
                }
            }

            return if (maxHeap.isEmpty()) 0 else maxHeap.poll()
        }

        fun lastStoneWeightUsingList(weights: Array<Int>): Int {
            val list = weights.toMutableList()
            list.sortDescending()

            while (list.size > 1) {
                val first = list.removeAt(0)
                val second = list.removeAt(0)

                if (first != second) {
                    val difference = abs(first - second)
                    list.add(0, difference)
                }
            }

            return list.firstOrNull() ?: 0
        }

        fun minStoneSum(piles: IntArray, k: Int): Int {
            val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
            maxHeap.addAll(piles.toList())

            var remainingOperations = k

            while (remainingOperations > 0) {
                val currentPile = maxHeap.poll()
                val stoneToRemove = (currentPile - floor((currentPile / 2).toDouble())).toInt()
                maxHeap.add(stoneToRemove)
                remainingOperations--
            }

            return maxHeap.sum()
        }

        fun connectSticks(sticks: IntArray): Int {
            if (sticks.size <= 1) return 0

            val minHeap = PriorityQueue<Int>()
            minHeap.addAll(sticks.toList())

            var totalConnectionCost = 0

            while (minHeap.size > 1) {
                val first = minHeap.poll()
                val second = minHeap.poll()

                val connectedStickCost = first + second
                totalConnectionCost += connectedStickCost

                minHeap.add(connectedStickCost)
            }

            return totalConnectionCost
        }


    }


}