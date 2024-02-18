class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val pValue: Long = p.toLong()

        for (i in 0 until t.length - p.length + 1) {
            val subStr: String = t.substring(i, i + p.length)
            val subLong: Long = subStr.toLong()

            if (subLong <= pValue) {
                answer += 1
            }
        }
        
        return answer
    }
}