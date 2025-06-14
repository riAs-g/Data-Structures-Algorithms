import java.util.HashSet

fun main() {

    fun dfs(i: Int, s: String, words: HashSet<String>): Int {
        if (i == s.length) {
            return 0
        }
        var res = 1 + dfs(i + 1, s, words)
        for (j in i..s.length - 1) {
            if (words.contains(s.substring(i, j + 1))) {
                res = Math.min(res, dfs(j + 1, s, words))
            }
        }
        return res
    }

    fun minExtraChar(s: String, dictionary: Array<String>): Int {
        var words: HashSet<String> = HashSet()
        for (word in dictionary) {
            words.add(word)
        }
        return dfs(0, s, words)
    }

    println(minExtraChar("leetscode", arrayOf("leet", "code", "leetcode")))
}
