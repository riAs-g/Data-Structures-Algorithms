import java.util.Scanner

fun main() {
    print("Enter numbers of tests: ")
    val scan = Scanner(System.`in`)

    fun findPairs(i: Int) {
        var res = 0
        var j = 1
        var k = i-1
        while (k != 0 || j != i) {
            if (j + k == i)
                res += 1
            j++
            k--
        }
        println(res)
    }


    for (v in 1..scan.nextInt()) {
        print("Enter a number to find pairs of: ")
        findPairs(scan.nextInt())
    }
}
