package org.example.codeQuest

import java.util.Stack

class ValidParentheses {
    /**
     * Problem Statement: https://leetcode.com/problems/valid-parentheses/
     */
    companion object {
        fun isValid(s: String): Boolean {
            if (isSingleCharacter(s)) return false

            val bracketsMap = mapOf(')' to '(', '}' to '{', ']' to '[')
            val stack = Stack<Char>()

            val characters = s.toCharArray()

            for (i in characters.indices) {
                val bracket = characters[i]
                if (isOpeningBracket(bracketsMap, bracket)) {
                    stack.push(bracket)
                } else if (isClosingBracket(bracketsMap, bracket)) {
                    val poppedBracket = if (stack.isEmpty()) ' ' else stack.pop()
                    if (poppedBracket != bracketsMap.getValue(bracket)) {
                        return false
                    }
                }
            }
            return stack.isEmpty()
        }

        private fun isSingleCharacter(s: String): Boolean {
            return s.length == 1
        }

        private fun isOpeningBracket(bracketsMap: Map<Char, Char>, bracket: Char) =
            bracketsMap.containsValue(bracket)

        private fun isClosingBracket(bracketsMap: Map<Char, Char>, bracket: Char) =
            bracketsMap.containsKey(bracket)
    }
}