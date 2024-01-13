class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr
        if(answer.size == 1) return intArrayOf(-1)
        
        val min = answer.minOrNull() ?: return intArrayOf()
        answer = answer.filter { it != min }.toIntArray()
        return answer
    }
}