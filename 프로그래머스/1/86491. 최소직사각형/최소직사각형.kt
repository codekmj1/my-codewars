import kotlin.math.max

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxLongSide = 0
        var maxShortSide = 0

        for (size in sizes) {
            val sorted = size.sortedArray()
            maxLongSide = max(maxLongSide, sorted[1])  
            maxShortSide = max(maxShortSide, sorted[0])  
        }

        return maxLongSide * maxShortSide
    }
}