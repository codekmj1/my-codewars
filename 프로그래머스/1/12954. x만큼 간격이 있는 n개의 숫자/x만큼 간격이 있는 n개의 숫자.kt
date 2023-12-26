class Solution {
    fun solution(x: Int, n: Int): LongArray {
        
        val answer = LongArray(n) { i -> x.toLong() * (i + 1) }
        return answer
    }
}