import java.util.*

fun main() {
    println("Enter a number")
    val number1 = Scanner(System.`in`)
    val numNumber: Double = number1.nextDouble()

    println("Enter a power")
    val number2 = Scanner(System.`in`)
    val numPower: Int = number2.nextInt()

    val ans: Double = getPower(numNumber, numPower)
    println(ans)
}

fun getPower(numNumber: Double, numPower: Int): Double {
    var pow: Long = numPower.toLong()
    var number: Double = numNumber

    if (number < -10000 || number > 10000) {
        return 0.0
    }
    if (pow == 0L) {
        return 1.0
    }
    if (pow < 0) {
        pow *= -1
        number = 1 / number
    }
    return if (pow % 2 == 0L) {
        getPower(number * number, (pow / 2).toInt())
    } else {
        number * getPower(number, (pow - 1).toInt())
    }
}
