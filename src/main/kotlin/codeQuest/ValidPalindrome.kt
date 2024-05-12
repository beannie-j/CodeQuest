package org.example.codeQuest

import java.util.*

class ValidPalindrome {
    companion object {
        fun isPalindrome(s: String): Boolean {
            if (s.isBlank() || s.isEmpty()) return true

            val cleanString = convertToAlphanumericLowerCase(s)
            val charArray = cleanString.toCharArray()

            var lowPtr = 0
            var highPtr = charArray.size - 1
            while (lowPtr < highPtr) {
                val lowValue = charArray[lowPtr]
                val highValue = charArray[highPtr]

                when {
                    lowValue == highValue -> {
                        lowPtr++
                        highPtr--
                    }

                    lowValue != highValue -> {
                        return false
                    }
                }
            }

            return true
        }

        private fun convertToAlphanumericLowerCase(input: String): String {
            // Convert the input string to lowercase
            val lowercaseString = input.lowercase(Locale.getDefault())

            // Define a regex pattern to match non-alphanumeric characters
            val regex = Regex("[^a-z0-9]")

            // Use replace function with the regex pattern to remove non-alphanumeric characters
            return lowercaseString.replace(regex, "")
        }
    }
}
