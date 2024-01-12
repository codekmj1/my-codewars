class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 45 
        for (number in numbers) {
            answer -= number 
        }
        return answer 
    }
}