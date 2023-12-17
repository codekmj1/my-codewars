// 문제 12. 정수를 담고 있는 배열 arr의
// 평균값을 return하는 함수, solution을 완성해보세요.

//실제 코드로 테스트
//fun main(){
//    var answer = 0.0
//    val arr = arrayOf(1,2,3,4)
//    val leng = arr.size
//    var sum=0.0
//    for(i in 0..arr.size-1){
//        sum = (sum+arr[i])
//        answer = sum/arr.size
//    }
//    println("${arr[1]}")
//    println("${arr.size}")
//    println("${sum}")
//    println("${answer}")
//
//}

// 알고리즘 (첫 풀이)
class Solution12 {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        //배열의 원소 총합 sum
        var sum=0.0
        // 배열의 원소 i 범위를 0부터 배열 크기-1까지 지정
        for(i in 0..arr.size-1){
            // 배열의 첫 번째 원소부터 끝까지 총합을 sum에 대입
            sum = (sum+arr[i])
            // sum / arr 배열 크기 값을 answer에 대입
            answer = sum/arr.size
        }
        return answer
    }
}