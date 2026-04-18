package com.anagram.io

import java.io.File

fun getWordsFromFile(): List<String> {
    return File("eventyr.txt")
        .readLines()
        .flatMap { it.split(" ") } // handle lines with multiple words on one line. Assumes that multi word lines are acceptable, even if they do not exist in the eventyr.txt file
        .filter { it.isNotBlank() }
}
