class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val x = Math.sqrt(n.toDouble())
        if (x - x.toInt() == 0.0) {
            answer = Math.pow(x + 1, 2.0).toLong()
        } else {
           answer = -1
        }
        return answer
    }
}