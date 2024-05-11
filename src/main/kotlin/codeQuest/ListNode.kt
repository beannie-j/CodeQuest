package org.example.codeQuest

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ListNode) return false

        if (`val` != other.`val`) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}