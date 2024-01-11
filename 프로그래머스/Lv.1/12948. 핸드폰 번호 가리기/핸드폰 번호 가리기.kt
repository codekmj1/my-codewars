class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        for (i in 0 until phone_number.length - 4) {
            answer += "*"
        }
        answer += phone_number.substring(phone_number.length - 4)
        return answer
    }
}