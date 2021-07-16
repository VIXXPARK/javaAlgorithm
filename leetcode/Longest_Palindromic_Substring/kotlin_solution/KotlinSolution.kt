package kotlin_solution

class KotlinSolution {
    var lo:Int = 0
    var maxLen:Int = 0
    fun longestPalindrome(s: String): String {
        val len = s.length
        if(len<2) return s
        for(i in 0 until len-1){
            helper(s,i,i)
            helper(s,i,i+1)
        }
        return s.substring(lo,lo+maxLen)

    }
    private fun helper(s:String,j:Int,k:Int){
        var j = j
        var k = k
        while(j>=0 && k<s.length && s[j]==s[k]){
            j--
            k++
        }
        if(maxLen<k-j-1){
            lo = j+1
            maxLen = k-j-1
        }
    }
}