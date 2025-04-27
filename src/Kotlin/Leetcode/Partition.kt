fun main() {

    fun canPartitionKSubsets(nums: IntArray, k: Int): Boolean {
        val target = nums.sum()/k
        val used = MutableList(nums.size){false}

        if(nums.sum() % k != 0)
            return false

        fun dfs(i: Int, k: Int, subsum: Int): Boolean {
            if (k == 0)
                return true

            if (subsum == target)
                return dfs(0, k-1, 0)

            for (j in i until nums.size) {
                if (used[j] || subsum+nums[j] > target)
                    continue

                used[j] = true

                if (dfs(j+1, k, subsum+nums[j]))
                    return true

                used[j] = false
            }
            return false
        }
        return (dfs(0, k, 0))
    }
    println(canPartitionKSubsets(intArrayOf(1,2,3,4), 3))
}
