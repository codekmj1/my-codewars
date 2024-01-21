class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var total: Long = ((1 + count.toLong()) * count / 2) * price
        var answer: Long = if (total > money) total - money else 0
        return answer
    }
}