package com.example.first

fun main() {
    val words = mapOf(
        "benevolent" to "well meaning and kindly",
    "candid" to "truthful and straightforward",
    "diligent" to "showing care in one's work or duties",
    "elated" to "very happy or proud; joyful",
    "frugal" to "economical or thrifty",
    "gregarious" to "fond of company; sociable",
    "humble" to "having or showing a modest opinion of oneself",
    "ingenious" to "clever, original, and inventive",
    "jubilant" to "feeling or expressing great happiness",
    "keen" to "showing eagerness or enthusiasm"
    )
    println("Enter a word to find its meaning: ")
    val input: String = readln().lowercase()
    println(words[input])
}