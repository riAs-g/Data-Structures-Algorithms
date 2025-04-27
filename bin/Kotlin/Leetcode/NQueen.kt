fun main() {

    fun isSafe(r: Int, c: Int, board: Array<CharArray>): Boolean {
        for (i in r - 1 downTo 0) {
            if (board[i][c] == 'Q') return false
        }

        var i = r - 1
        var j = c - 1
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') return false
            i--
            j--
        }

        i = r - 1
        j = c + 1
        while (i >= 0 && j < board.size) {
            if (board[i][j] == 'Q') return false
            i--
            j++
        }
        return true
    }

    fun dfs(r: Int, board: Array<CharArray>, res: MutableList<List<String>>) {
        if (r == board.size) {
            val copy: MutableList<String> = ArrayList()
            for (row in board) {
                copy.add(String(row))
            }
            res.add(copy)
            return
        }
        for (c in board.indices) {
            if (isSafe(r, c, board)) {
                board[r][c] = 'Q'
                dfs(r + 1, board, res)
                board[r][c] = '.'
            }
        }
    }

    fun queens(n: Int): List<List<String>> {
        val res: MutableList<List<String>> = ArrayList()
        val board = Array(n) { CharArray(n) }
        for (i in 0..<n) {
            for (j in 0..<n) {
                board[i][j] = '.'
            }
        }
        dfs(0, board, res)
        return res
    }

    println(queens(4))
}
