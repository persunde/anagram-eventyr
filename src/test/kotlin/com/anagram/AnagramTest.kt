package com.anagram

import com.anagram.io.getWordsFromFile
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class AnagramTest {

    @Test
    fun `findAnagrams returns non-anagram group`() {
        val anagramMap = findAnagrams()

        assertTrue(anagramMap.isNotEmpty(), "Expected anagram map to not be empty")

        for ((key, wordList) in anagramMap) {
            for (word in wordList) {
                val sortedWord = String(word.toCharArray().also { it.sort() })
                assertTrue(sortedWord == key, "Word '$word' does not belong in group '$key'")
            }
        }
    }
}
