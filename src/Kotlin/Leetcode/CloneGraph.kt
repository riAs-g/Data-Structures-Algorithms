class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList<Node?>()
}

fun main() {
    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null
        val oldToNew = HashMap<Node, Node>()
        fun dfs(node: Node): Node {
            if (node in oldToNew) {
                return oldToNew[node]!!
            }

            val copy = Node(node.`val`)
            oldToNew[node] = copy

            for (nei in node.neighbors) {
                nei?.let { copy.neighbors.add(dfs(it)) }
            }
            return copy
        }

        return dfs(node)
    }
}
