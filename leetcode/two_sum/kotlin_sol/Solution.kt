class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var ans = IntArray(2)
        var cache: HashMap<Int, Int> = HashMap()
        for (i in 0 until nums.size) {
            if (cache.containsKey(target - nums[i])) {
                ans[0] = cache.get(target - nums[i])!!
                ans[1] = i
                break
            } else {
                cache.put(nums[i], i)
            }
        }
        return ans
    }
}