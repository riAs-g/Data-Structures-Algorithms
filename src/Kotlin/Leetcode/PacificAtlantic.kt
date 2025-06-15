fun main() {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        if (heights.isEmpty() || heights[0].isEmpty()) return emptyList()

        val rows = heights.size
        val cols = heights[0].size
        val pacific = Array(rows) { BooleanArray(cols) }
        val atlantic = Array(rows) { BooleanArray(cols) }

        fun dfs(r: Int, c: Int, visited: Array<BooleanArray>, prevHeight: Int) {
            if (r < 0 ||
                            r >= rows ||
                            c < 0 ||
                            c >= cols ||
                            visited[r][c] ||
                            heights[r][c] < prevHeight
            )
                    return
            visited[r][c] = true
            dfs(r + 1, c, visited, heights[r][c])
            dfs(r - 1, c, visited, heights[r][c])
            dfs(r, c + 1, visited, heights[r][c])
            dfs(r, c - 1, visited, heights[r][c])
        }

        for (i in 0 until rows) {
            dfs(i, 0, pacific, heights[i][0]) // Pacific edge
            dfs(i, cols - 1, atlantic, heights[i][cols - 1]) // Atlantic edge
        }
        for (j in 0 until cols) {
            dfs(0, j, pacific, heights[0][j]) // Pacific edge
            dfs(rows - 1, j, atlantic, heights[rows - 1][j]) // Atlantic edge
        }

        val result = mutableListOf<List<Int>>()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(listOf(i, j))
                }
            }
        }
        return result
    }

    val heights =
            arrayOf(
                    intArrayOf(1, 2, 2, 3, 5),
                    intArrayOf(3, 2, 3, 4, 4),
                    intArrayOf(2, 4, 5, 3, 1),
                    intArrayOf(6, 7, 1, 4, 5),
                    intArrayOf(5, 1, 1, 2, 4)
            )
    val result = pacificAtlantic(heights)
    println(result) // Expected output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
}
