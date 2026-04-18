package com.anagram.io

import java.io.File

fun getWordsFromFile(): List<String> {
    return File("eventyr.txt")
        .readLines()
        .flatMap { it.split(" ") }
        .filter { it.isNotBlank() }
}
