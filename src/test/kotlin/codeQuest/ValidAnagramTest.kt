package codeQuest

import org.example.codeQuest.ValidAnagram.Companion.isAnagram
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidAnagramTest {
    @Test
    fun testAnagram() {
        val s = "anagram"
        val t = "nagaram"
        val actual = isAnagram(s, t)
        assertTrue(actual)
    }

    @Test
    fun testNotAnagram() {
        val s = "rat"
        val t = "car"
        val actual = isAnagram(s, t)
        assertFalse(actual)
    }

    @Test
    fun testEmptyStrings() {
        val s = ""
        val t = ""
        val actual = isAnagram(s, t)
        assertTrue(actual)
    }

    @Test
    fun testDifferentLengthStrings() {
        val s = "abc"
        val t = "ab"
        assertFalse(isAnagram(s, t))
    }
}