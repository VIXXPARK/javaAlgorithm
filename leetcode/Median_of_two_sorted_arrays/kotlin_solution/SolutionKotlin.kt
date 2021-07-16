package kotlin_solution

class SolutionKotlin {
    fun findMedianSortedArrays(A: IntArray, B: IntArray): Double {
        val m = A.size
        val n = B.size
        val l = (m + n + 1) / 2
        val r = (m + n + 2) / 2
        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0
    }

    fun getkth(A: IntArray, aStart: Int, B: IntArray, bStart: Int, k: Int): Double {
        if (aStart > A.size - 1) return B[bStart + k / 2 - 1].toDouble()
        if (bStart > B.size - 1) return A[aStart + k / 2 - 1].toDouble()
        if (k == 1) return Math.min(A[aStart], B[bStart]).toDouble()
        var aMid = Int.MAX_VALUE
        var bMid = Int.MAX_VALUE
        if (aStart + k / 2 - 1 < A.size) aMid = A[aStart + k / 2 - 1]
        if (bStart + k / 2 - 1 < B.size) bMid = B[bStart + k / 2 - 1]
        return if (aMid < bMid) getkth(A, aStart + k / 2, B, bStart, k - k / 2) else getkth(A, aStart, B, bStart + k / 2, k - k / 2)
    }
}