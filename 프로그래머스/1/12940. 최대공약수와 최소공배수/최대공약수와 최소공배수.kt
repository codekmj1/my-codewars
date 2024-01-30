class Solution {
    fun solution(n: Int, m: Int): IntArray {
        fun gcd(a: Int, b: Int): Int {
            return if (b == 0) a else gcd(b, a % b)
        }
        val g = gcd(n, m)
        return intArrayOf(g, n * m / g)
    }
}