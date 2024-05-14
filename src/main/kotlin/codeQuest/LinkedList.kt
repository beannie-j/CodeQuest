package org.example.codeQuest

class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null

    fun insert(data: Int) {
        val newNode = Node(data)

        if (head == null) {
            head = newNode
        } else {
            var lastNode = head
            while (lastNode?.next != null) {
                lastNode = lastNode.next
            }
            lastNode?.next = newNode
        }
    }

    fun delete(data: Int): Node? {
        if (head == null) {
            return head // Empty list, return original list
        }

        // If the node to delete is the head node
        if (head?.next != null && head?.data == data) {
            return head?.next
        }

        var prev: Node? = null
        var current = head

        while (current != null) {
            if (current.data == data) {
                prev?.next = current.next
                return head
            }
            prev = current
            current = current.next
        }

        return head
    }
}

class LinkedListUtils {
    companion object {
        fun getMiddle(linkedList: LinkedList): Node? {
            var slowPointer = linkedList.head
            var fastPointer = linkedList.head?.next

            while (fastPointer?.next != null) {
                slowPointer = slowPointer?.next
                fastPointer = fastPointer.next?.next
            }

            return slowPointer
        }
    }
}