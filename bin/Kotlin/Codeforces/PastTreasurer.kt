import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    print("Enter the number of tests: ")
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val t = reader.readLine().toInt()
    for (i in 1..t) {
        print("Enter the length of String: ")
        val len = reader.readLine().toInt()
        print("Enter the String of length $len: ")
        val s = reader.readLine()
        if (len < 3) {
            println(0)
            return
        }

        val permutations = mutableListOf<String>()
        fun generatePermutations(input: String): List<String> {
            helper(input.toCharArray(), 0, permutations)
            return permutations
        }
        generatePermutations(s)

        var res = 0
        fun dfs(s: String, temp: String, i: Int) {
            if (temp == "-_-") {
                res++
                return
            }
            if (i == s.length-1) {
                return
            }
            if (temp == "-" && s[i+1] == '_') {
                dfs(s, temp + s[i + 1], i + 1)
            }
            if (temp == "-_" && s[i+1] == '-') {
                dfs(s, temp + s[i + 1], i + 1)
            }
            dfs(s, temp, i+1)
        }
        fun findCombos(list: MutableList<String>) {
            var temp = -1
            for (l in list) {
                for (index in l.indices) {
                    if (l[index] == '-')
                        dfs(l, "-", index)
                }
                temp = temp.coerceAtLeast(res)
                res = 0
            }
            println(temp)
        }
        findCombos(permutations)
    }
}

fun swap(input: CharArray, i: Int, j: Int) {
    val temp = input[i]
    input[i] = input[j]
    input[j] = temp
}

fun helper(input: CharArray, index: Int, permutations: MutableList<String>) {
    if (index == input.size - 1) {
        permutations.add(String(input))
        return
    }

    for (i in index until input.size) {
        swap(input, index, i)
        helper(input, index + 1, permutations)
        swap(input, index, i) // Backtracking step
    }
}
