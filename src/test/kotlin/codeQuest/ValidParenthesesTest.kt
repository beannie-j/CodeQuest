package codeQuest

import org.example.codeQuest.ValidParentheses.Companion.isValid
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    @Test
    fun testValidBrackets1() {
        assertTrue(isValid("()[]{}"))
    }

    @Test
    fun testValidBrackets2() {
        assertTrue(isValid("[]"))
    }

    @Test
    fun testValidBrackets3() {
        assertTrue(isValid("{}"))
    }

    @Test
    fun testValidNestedBrackets() {
        assertTrue(isValid("{[()]}"))
    }

    @Test
    fun testValidMixedBrackets() {
        assertTrue(isValid("[{()}]"))
    }

    @Test
    fun testInvalidMissingClosingBracket() {
        assertFalse(isValid("("))
    }

    @Test
    fun testInvalidMissingOpeningBracket() {
        assertFalse(isValid(")"))
    }

    @Test
    fun testInvalidMismatchedBrackets1() {
        assertFalse(isValid("(]"))
    }

    @Test
    fun testInvalidMismatchedBrackets2() {
        assertFalse(isValid("([)]"))
    }

    @Test
    fun testInvalidExtraClosingBracket() {
        assertFalse(isValid("()}"))
    }
}