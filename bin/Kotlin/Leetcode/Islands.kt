fun main() {
    fun numIslands(grid: Array<IntArray>) {
        if (grid.isEmpty()) println("0,0")

        val rows = grid.size
        val cols = grid[0].size
        var islandCount = 0
        var size = 0

        fun dfs(r: Int, c: Int): Int {
            if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0) return 0
            grid[r][c] = 0 // Mark as visited
            return 1 + dfs(r + 1, c) + dfs(r - 1, c) + dfs(r, c + 1) + dfs(r, c - 1)
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] == 1) {
                    islandCount++
                    size = Math.max(size, dfs(r, c))
                }
            }
        }
        println("Max size of island: $size")
        println("Number of islands: $islandCount")
    }

    numIslands(
            arrayOf(
                    intArrayOf(1, 1, 0, 1, 0),
                    intArrayOf(1, 1, 0, 1, 0),
                    intArrayOf(1, 1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0),
            )
    )
}
