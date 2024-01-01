class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0
        var temp = x
        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        if(x%sum==0)answer = true
        else answer = false
        return answer
    }
}