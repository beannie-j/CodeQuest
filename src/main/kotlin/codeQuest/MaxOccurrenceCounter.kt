package org.example.codeQuest

class MaxOccurrenceCounter {
    /**
     * Represents a 2-dimensional array with corresponding index-letter mappings.
     *
     * Legend:
     *  - Indices: 0 to 1
     *  - Letters: a, b, c, d, e
     *
     * Example array:
     *   a  b  c  d  e
     * 0.1 0.1 0 1 0 -> Corresponds to letter 'd'
     * 0 1 0 0 0 -> Corresponds to letter 'b'
     * 0.5 0 1 0 1 -> Corresponds to letter 'c'
     *
     * Resulting occurrences:
     *   a 0, b 1, c 1, d 1, e 0 - Map <Char, Int>
     *
     * Index-Letter mapping:
     *   0 1 2 3 4 -> a b c d e
     */

    fun countMaxValueIndices(arrays: List<List<Int>>): MutableMap<Char, Int> {
        val countMap = mutableMapOf<Char, Int>()
        arrays.forEach { array ->
            val maxIndex = findIndexOfMaxValue(array)
            val indexToLetter = mapIndexToLetter(maxIndex)
            countMap[indexToLetter] = countMap.getOrDefault(indexToLetter, 0) + 1
        }
        return countMap
    }

    private fun mapIndexToLetter(index: Int): Char {
        require(index in 0..4) { "Index must be in the range 0 to 4" }
        return when(index) {
            0 -> 'a'
            1 -> 'b'
            2 -> 'c'
            3 -> 'd'
            4 -> 'e'
            else -> throw IllegalArgumentException("Invalid index: $index")
        }
    }

    private fun findIndexOfMaxValue(array: List<Int>): Int {
        /**
         * Illustrates the process of finding the index of the maximum value in an array.
         *
         * Steps:
         *   - i = 0, value = 0.5, max = 0.5 -> Index 0
         *   - i = 1, value = 0, max = 0.5 -> Index 0
         *   - i = 2, value = 1, max = 0.5 -> Index 1
         *   - i = 3, value = 0, max = 1 -> Index 0, 1
         *   - i = 4, value = 1, max = 1 -> Index 0, 1, 4
         */

        var max = Integer.MIN_VALUE
        var maxIndex = 0    // Initialize index of max
        for (i in array.indices) {
            if (array[i] > max) {
                max = array[i]
                maxIndex = i
            }
        }
        return maxIndex
    }

}