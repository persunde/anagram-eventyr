# Anagram

A Kotlin project.

## Prerequisites

- JDK 11 or higher
- Maven 3.6+

## Build

```bash
mvn package
```

This compiles the Kotlin source and produces `target/anagram.jar`.

## Run

```bash
java -jar target/anagram.jar
```

Expected output:

```
at ta
bar bra
bry byr
dem med
den ned
denne enden
...
```

## Run tests

```bash
mvn test
```


## Assumptions

Assume we only want to print out anagram groups of more than one word/anagram.

Assumes we do not want to print out the same anagram group more than once. 
So "bar" and "bra", are both anagrams, but we print out the group only one time. And we do not go through every single word in the file and print out the corresponding anagrams, because then we end up printing the same groups multiple times.