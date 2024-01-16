class Solution {
    fun solution(s: String): String {
        val length = s.length
        val middle = length / 2
        var answer = if (length % 2 == 0) {
            s.substring(middle - 1, middle + 1)
        } else {
            s[middle].toString()
        }

        return answer
    }
}