fun main() {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val trustCount = IntArray(n + 1)
        val trustedCount = IntArray(n + 1)

        for (pair in trust) {
            trustCount[pair[0]]++
            trustedCount[pair[1]]++
        }

        for (i in 1..n) {
            if (trustCount[i] == 0 && trustedCount[i] == n - 1) {
                return i
            }
        }
        return -1
    }

    println(findJudge(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3))))
}
