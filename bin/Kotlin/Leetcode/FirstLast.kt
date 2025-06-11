fun main() {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val n = nums.size
        var left = 0
        var right = n - 1
        var first = -1
        var last = -1

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                first = mid
                right = mid - 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        if (first == -1) return intArrayOf(-1, -1)

        left = first
        right = n - 1

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                last = mid
                left = mid + 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return intArrayOf(first, last)
    }

    println(searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).contentToString())
}
