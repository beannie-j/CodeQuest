package codeQuest

import org.example.codeQuest.LinkedList
import org.example.codeQuest.LinkedListUtils
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LinkedListUtilsTest {

    @Test
    fun testGetMiddle_oddLengthList() {
        val linkedList = LinkedList()
        linkedList.insert(1)
        linkedList.insert(2)
        linkedList.insert(3)
        linkedList.insert(4)
        linkedList.insert(5)

        val middleNode = LinkedListUtils.getMiddle(linkedList)
        assertEquals(3, middleNode?.data)
    }

    @Test
    fun testGetMiddle_evenLengthList() {
        val linkedList = LinkedList()
        linkedList.insert(1)
        linkedList.insert(2)
        linkedList.insert(3)
        linkedList.insert(4)
        linkedList.insert(5)
        linkedList.insert(6)

        val middleNode = LinkedListUtils.getMiddle(linkedList)
        assertEquals(3, middleNode?.data)
    }

    @Test
    fun testGetMiddle_singleNodeList() {
        val linkedList = LinkedList()
        linkedList.insert(1)

        val middleNode = LinkedListUtils.getMiddle(linkedList)
        assertEquals(1, middleNode?.data)
    }

    @Test
    fun testGetMiddle_emptyList() {
        val linkedList = LinkedList()

        val middleNode = LinkedListUtils.getMiddle(linkedList)
        assertEquals(null, middleNode)
    }

    @Test
    fun testDeleteFromEmptyList() {
        val linkedList = LinkedList()
        val deletedList = linkedList.delete(5)
        assertEquals(null, deletedList)
    }

    @Test
    fun testDeleteHeadNode() {
        val linkedList = LinkedList()
        linkedList.insert(5)
        linkedList.insert(10)
        linkedList.insert(15)

        val deletedList = linkedList.delete(5)
        assertEquals(10, deletedList?.data)
        assertEquals(15, deletedList?.next?.data)
        assertEquals(null, deletedList?.next?.next)
    }

    @Test
    fun testDeleteMiddleNode() {
        val linkedList = LinkedList()
        linkedList.insert(5)
        linkedList.insert(10)
        linkedList.insert(15)

        val deletedList = linkedList.delete(10)
        assertEquals(5, deletedList?.data)
        assertEquals(15, deletedList?.next?.data)
        assertEquals(null, deletedList?.next?.next)
    }

    @Test
    fun testDeleteLastNode() {
        val linkedList = LinkedList()
        linkedList.insert(5)
        linkedList.insert(10)
        linkedList.insert(15)

        val deletedList = linkedList.delete(15)
        assertEquals(5, deletedList?.data)
        assertEquals(10, deletedList?.next?.data)
        assertEquals(null, deletedList?.next?.next)
    }

    @Test
    fun testDeleteNonExistentNode() {
        val linkedList = LinkedList()
        linkedList.insert(5)
        linkedList.insert(10)
        linkedList.insert(15)

        val deletedList = linkedList.delete(20)
        assertEquals(5, deletedList?.data)
        assertEquals(10, deletedList?.next?.data)
        assertEquals(15, deletedList?.next?.next?.data)
        assertEquals(null, deletedList?.next?.next?.next)
    }
}