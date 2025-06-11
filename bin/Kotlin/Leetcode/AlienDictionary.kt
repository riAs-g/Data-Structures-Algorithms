fun main() {

    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val (n, m) = arrayOf(words.size, order.length)
        val arr = IntArray(26)
        for (i in 0..m - 1) {
            arr[order[i] - 'a'] = i
        }

        for (i in 1..n - 1) {
            val (prev, curr) = arrayOf(words[i - 1], words[i])
            val min = minOf(prev.length, curr.length)
            for (j in 0..min - 1) {
                if (prev[j] != curr[j]) {
                    if (arr[prev[j] - 'a'] > arr[curr[j] - 'a']) {
                        return false
                    } else {
                        continue
                    }
                }
            }
            if (prev.length > curr.length) return false
        }
        return true
    }

    println(isAlienSorted(arrayOf("word", "world", "row"), "worldabcefghijkmnpqstuvxyz"))
}
