import org.example.codeQuest.ListNode
import org.example.codeQuest.MergeTwoSortedLists
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class MergeTwoSortedListsTest {

    @Test
    fun testMergeTwoLists_BothEmpty() {
        val list1: ListNode? = null
        val list2: ListNode? = null
        val expected: ListNode? = null
        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertEquals(expected, actual)
    }

    @Test
    fun testMergeTwoLists_FirstEmpty() {
        val list1: ListNode? = null
        val list2 = ListNode(1)
        val expected = ListNode(1)
        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_SecondEmpty() {
        val list1 = ListNode(1)
        val list2: ListNode? = null
        val expected = ListNode(1)
        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_EqualLength() {
        val list1 = ListNode(1)
        list1.next = ListNode(3)
        list1.next!!.next = ListNode(5)

        val list2 = ListNode(2)
        list2.next = ListNode(4)
        list2.next!!.next = ListNode(6)

        val expected = ListNode(1)
        expected.next = ListNode(2)
        expected.next!!.next = ListNode(3)
        expected.next!!.next!!.next = ListNode(4)
        expected.next!!.next!!.next!!.next = ListNode(5)
        expected.next!!.next!!.next!!.next!!.next = ListNode(6)

        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_FirstLonger() {
        val list1 = ListNode(1)
        list1.next = ListNode(3)
        list1.next!!.next = ListNode(5)

        val list2 = ListNode(2)

        val expected = ListNode(1)
        expected.next = ListNode(2)
        expected.next!!.next = ListNode(3)
        expected.next!!.next!!.next = ListNode(5)

        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_SecondLonger() {
        val list1 = ListNode(1)

        val list2 = ListNode(2)
        list2.next = ListNode(4)
        list2.next!!.next = ListNode(6)

        val expected = ListNode(1)
        expected.next = ListNode(2)
        expected.next!!.next = ListNode(4)
        expected.next!!.next!!.next = ListNode(6)

        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_Duplicates() {
        val list1 = ListNode(1)
        list1.next = ListNode(1)
        list1.next!!.next = ListNode(1)

        val list2 = ListNode(1)
        list2.next = ListNode(1)
        list2.next!!.next = ListNode(1)

        val expected = ListNode(1)
        expected.next = ListNode(1)
        expected.next!!.next = ListNode(1)
        expected.next!!.next!!.next = ListNode(1)
        expected.next!!.next!!.next!!.next = ListNode(1)
        expected.next!!.next!!.next!!.next!!.next = ListNode(1)

        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_FirstNull() {
        val list1: ListNode? = null

        val list2 = ListNode(1)
        val expected = ListNode(1)

        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_SecondNull() {
        val list1 = ListNode(1)

        val list2: ListNode? = null
        val expected = ListNode(1)

        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertTrue(expected.equals(actual))
    }

    @Test
    fun testMergeTwoLists_BothNull() {
        val list1: ListNode? = null
        val list2: ListNode? = null
        val expected: ListNode? = null
        val actual = MergeTwoSortedLists.mergeTwoLists(list1, list2)
        assertEquals(expected, actual)
    }
}
