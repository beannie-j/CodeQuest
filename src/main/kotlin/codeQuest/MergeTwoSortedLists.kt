package org.example.codeQuest

class MergeTwoSortedLists {
    companion object {
        fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
            val mergedList = ListNode()
            var mergedCurrent = mergedList

            var firstCurrent = list1
            var secondCurrent = list2

            while (firstCurrent != null && secondCurrent != null) {
                val firstNodeValue = firstCurrent.`val`
                val secondNodeValue = secondCurrent.`val`

                println("First node value: $firstNodeValue")
                println("Second node value: $secondNodeValue")

                if (firstNodeValue <= secondNodeValue) {
                    mergedCurrent.next = firstCurrent
                    firstCurrent = firstCurrent.next
                } else {
                    mergedCurrent.next = secondCurrent
                    secondCurrent = secondCurrent.next
                }

                mergedCurrent = mergedCurrent.next ?: break
            }

            mergedCurrent.next = firstCurrent ?: secondCurrent

            return mergedList.next
        }
    }
}