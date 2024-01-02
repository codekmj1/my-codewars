class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        for (i in Math.min(a, b)..Math.max(a, b)) {
            answer += i
        }
        return answer
    }
}