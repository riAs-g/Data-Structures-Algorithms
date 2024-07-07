import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val bool: Boolean
    if (str.equals("RUN silent"))
        bool=true
    else
        bool=false
    println(bool)
}