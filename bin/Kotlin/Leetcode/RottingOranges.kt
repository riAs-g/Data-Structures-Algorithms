fun main() {

    data class Pair(val row: Int, val col: Int)

    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val queue = ArrayDeque<Pair>()
        var fresh = 0
        var time = 0

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] == 1) {
                    fresh++
                }
                if (grid[r][c] == 2) {
                    queue.addLast(Pair(r, c))
                }
            }
        }

        val directions =
                arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

        while (fresh > 0 && queue.isNotEmpty()) {
            val length = queue.size

            repeat(length) {
                val current = queue.removeFirst()

                for (dir in directions) {
                    val newRow = current.row + dir[0]
                    val newCol = current.col + dir[1]

                    if (newRow in 0 until rows &&
                                    newCol in 0 until cols &&
                                    grid[newRow][newCol] == 1
                    ) {
                        grid[newRow][newCol] = 2
                        queue.addLast(Pair(newRow, newCol))
                        fresh--
                    }
                }
            }
            time++
        }

        return if (fresh == 0) time else -1
    }

    println(orangesRotting(arrayOf(intArrayOf(2, 1, 1), intArrayOf(1, 1, 0), intArrayOf(0, 1, 1))))
}
