package codeQuest

import org.example.codeQuest.ValidPalindrome.Companion.isPalindrome
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidPalindromeTest {
    @Test
    fun testPalindrome() {
        val input = "A man, a plan, a canal: Panama"
        assertTrue(isPalindrome(input))
    }

    @Test
    fun testNotPalindrome() {
        val input = "race a car"
        assertFalse(isPalindrome(input))
    }

    @Test
    fun testEmptyString() {
        val input = " "
        assertTrue(isPalindrome(input))
    }
}