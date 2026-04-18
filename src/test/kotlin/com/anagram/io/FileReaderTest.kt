package com.anagram

import com.anagram.io.getWordsFromFile
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class FileReaderTest {

    @Test
    fun `getWordsFromFile returns a non-empty list of words`() {
        val words = getWordsFromFile()
        assertTrue(words.size == 1139, "Expected word count to be 1139")
        assertTrue(words.isNotEmpty(), "Expected words to be returned")
    }
}
