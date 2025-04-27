import java.util.*

fun main() {
    print("Enter a value K to find the largest Kth element: ")
    val scan = Scanner(System.`in`)
    val k: Int = scan.nextInt()
    val num: IntArray = intArrayOf(3,2,3,1,2,4,5,5,6)

    fun largest(): Int? {
        val heap: PriorityQueue<Int> = PriorityQueue()
        for (n in num) {
            heap.add(n)
            if (heap.size > k)
                heap.poll()
        }
        return if (!heap.isEmpty())
            heap.peek()
        else
            0
    }
    println(largest())
}
