package org.example.codeQuest

class ValidAnagram {
    companion object {
        fun isAnagram(s: String, t: String): Boolean {

            val sCharFrequencyMap = createCharFrequencyMap(s)
            val tCharFrequencyMap = createCharFrequencyMap(t)


            return sCharFrequencyMap == tCharFrequencyMap
        }

        private fun createCharFrequencyMap(s: String): Map<Char, Int> {
            val charMap = mutableMapOf<Char, Int>()

            for (char in s) {
                charMap[char] = charMap.getOrDefault(char, 0) + 1
            }

            return charMap.toMap()
        }
    }
}