import java.util.Scanner

fun main() {
    println("Enter a string")
    val string1 = Scanner(System.`in`)
    val str: String = string1.nextLine()

    println("Enter a subsequence")
    val string2 = Scanner(System.`in`)
    val seq: String = string2.nextLine()

    println(isPresent(str, seq))
}

fun isPresent(str: String, seq: String): Boolean {
    var i = 0
    var j = 0
    while (i < str.length && j < seq.length) {
        if (str[i] == seq[j]) {
            i++
            j++
        } else {
            i++
        }
    }
    return j > seq.length - 1
}
