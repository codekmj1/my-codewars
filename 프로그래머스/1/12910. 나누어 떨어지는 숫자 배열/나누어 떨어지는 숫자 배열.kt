class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        val filteredArr = arr.filter { it % divisor == 0 }.sorted()
        if (filteredArr.isEmpty()) answer = intArrayOf(-1) 
        else answer = filteredArr.toIntArray()
        return answer
    }
}