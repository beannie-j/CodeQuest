package codeQuest

import org.assertj.core.api.Assertions.assertThat
import org.example.codeQuest.MaxOccurrenceCounter
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MaxOccurrenceCounterTest {
    private lateinit var maxOccurrenceCounter: MaxOccurrenceCounter

    @BeforeEach
    fun setUp() {
        maxOccurrenceCounter = MaxOccurrenceCounter()
    }

    @Test
    fun `test countMaxValueIndices with list containing multiple sublists`() {
        val arrays = listOf(listOf(1, 2, 3), listOf(3, 2, 1), listOf(1, 3, 2))
        val result = maxOccurrenceCounter.countMaxValueIndices(arrays)
        assertThat(result).containsAllEntriesOf(mapOf('a' to 1, 'b' to 1, 'c' to 1))
    }
}