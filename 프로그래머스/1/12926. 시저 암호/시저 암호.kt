class Solution {
    fun solution(s: String, n: Int): String {
        var answer = StringBuilder()
        
        s.forEach { char ->
            when {
                char.isUpperCase() -> {
                    val shifted = (char - 'A' + n) % 26 + 'A'.toInt()
                    answer.append(shifted.toChar())
                }
                char.isLowerCase() -> {
                    val shifted = (char - 'a' + n) % 26 + 'a'.toInt()
                    answer.append(shifted.toChar())
                }
                else -> answer.append(char)
            }
        }
        return answer.toString()
    }
}