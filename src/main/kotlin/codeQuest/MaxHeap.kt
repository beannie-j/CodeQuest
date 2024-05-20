package org.example.codeQuest

import java.util.*
import kotlin.math.abs

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


        }


}