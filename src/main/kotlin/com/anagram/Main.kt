package com.anagram


fun main() {
    val anagramMap = findAnagrams()

    // Print the anagrams groups
    // Assumes we only want to print out anagram groups that have more than just one word.
    anagramMap.values
        .filter { it.size > 1 }
        .forEach { lst -> println(lst.joinToString(" ")) }
}