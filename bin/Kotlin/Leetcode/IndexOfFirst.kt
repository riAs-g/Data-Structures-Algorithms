import java.util.Scanner

fun main() {
    val string = Scanner(System.`in`)

    println("Enter a string")
    val haystack: String = string.nextLine()

    println("Enter a subsequence")
    val needle: String = string.nextLine()

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        for (i in 0..haystack.length - needle.length) {
            if (haystack.substring(i, i + needle.length) == needle) {
                return i
            }
        }
        return -1
    }
    println(strStr(haystack, needle))
}
