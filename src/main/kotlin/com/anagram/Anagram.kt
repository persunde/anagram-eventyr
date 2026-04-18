package com.anagram

import com.anagram.io.getWordsFromFile

fun findAnagrams(): Map<String, List<String>> {
    // Group anagrams together by using the sorted characters in the word as the key
    return getWordsFromFile().groupBy { word ->
        word.toCharArray().sorted().joinToString("")
    }
}
