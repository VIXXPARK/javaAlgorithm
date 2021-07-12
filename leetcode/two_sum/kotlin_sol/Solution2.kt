class Solution2 {
    fun twoSUm(numbers: IntArray, target: Int): IntArray {
        val indexMap = mutableMapOf<Int, Int>()
        val result = IntArray(2)
        for ((i, v) in numbers.withIndex()) {
            val value = indexMap[v]
            if (value != null) {
                result[0] = value
                result[1] = i
                break
            }
            indexMap[target - v] = i
        }
        return result
    }
}