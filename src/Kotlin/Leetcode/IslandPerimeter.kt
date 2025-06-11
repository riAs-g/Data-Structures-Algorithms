fun main() {
    var perimeter = 0

    fun islandPerimeter(grid: Array<IntArray>): Int {
        val C = grid.size
        val R = grid[0].size
        var visited = Array(C) { BooleanArray(R) }

        fun dfs(i: Int, j: Int) {
            if (i < 0 || i >= grid.size || j < 0 || j >= grid[i].size || grid[i][j] != 1) {
                perimeter++
                return
            }
            if (visited[i][j]) return

            visited[i][j] = true
            dfs(i - 1, j)
            dfs(i + 1, j)
            dfs(i, j - 1)
            dfs(i, j + 1)
        }

        for (i in 0 until C) {
            if (grid[i].contains(1)) {
                dfs(i, grid[i].indexOf(1))
                break
            } else continue
        }

        return perimeter
    }

    println(
            islandPerimeter(
                    arrayOf(
                            intArrayOf(0, 1, 0, 0),
                            intArrayOf(1, 1, 1, 0),
                            intArrayOf(0, 1, 0, 0),
                            intArrayOf(1, 1, 0, 0)
                    )
            )
    )
}
