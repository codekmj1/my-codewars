class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        answer = n.toString().toCharArray().sortedArrayDescending().joinToString("").toLong()
        return answer
    }
}