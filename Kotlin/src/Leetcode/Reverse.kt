package Leetcode

import java.util.*

fun main(args: Array<String>) {
    // Create a scanner object for reading user input.
    val scanner = Scanner(System.`in`)
    println("Enter a single String")
    // Read a line of input from the user.
    val inputString = scanner.nextLine()
    var rev=""
    // Call your function here to reverse the inputString.
    rev=(reverseString(inputString))
    // Print the reversed string.
    println(rev)
}

fun reverseString(inputString: String?): String {
    var rev=""
    if (inputString != null) {
        for (i in 0..inputString.length-1)
            rev=inputString.substring(i,i+1)+rev
    }
    return rev
}