import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a single String")
    val inputString = scanner.nextLine()
    val rev = (reverseString(inputString))
    println(rev)
}

fun reverseString(inputString: String?): String {
    var rev = ""
    if (inputString != null) {
        for (i in inputString.indices) rev = inputString.substring(i, i + 1) + rev
    }
    return rev
}
