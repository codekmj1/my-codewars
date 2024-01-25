class Solution {
    fun solution(s: String): Boolean {
        if(s.length != 4 && s.length != 6) 
            return false
        return s.all { it.isDigit() }
    }
}