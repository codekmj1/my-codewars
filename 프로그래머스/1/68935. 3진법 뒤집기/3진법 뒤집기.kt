class Solution {
    fun solution(n: Int): Int {
        var num = n
        var ternary = ""

        while (num > 0) {
            ternary = "${num % 3}$ternary"
            num /= 3
        }

        return ternary.reversed().toInt(3)
    }
}