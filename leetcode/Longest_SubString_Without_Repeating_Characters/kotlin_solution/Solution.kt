package kotlin_solution

import java.util.*


class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = HashMap<Char, Int>()
        var left = 0
        var ans = 0
        for (i in 0 until s.length) {
            if (map.containsKey(s[i])) {
                val loc = map[s[i]]!! + 1
                left = if (left > loc) left else loc
            }
            val value: Int = i - left + 1
            ans = if (ans < value) value else ans
            map.put(s[i], i)
        }
        return ans
    }
}