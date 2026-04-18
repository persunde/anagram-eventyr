package com.anagram

import com.anagram.io.getWordsFromFile

fun findAnagrams(): Map<String, List<String>> {
    return getWordsFromFile().groupBy { word ->
        word.toCharArray().sorted().joinToString("")
    }
}
