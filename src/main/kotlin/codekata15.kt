// 문제 15. 자연수 n이 매개변수로 주어집니다.
// n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록
// solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.

class Solution15 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        // x 범위가 1부터 n까지인 for 반복문
        for(x in 1..n){
            // 만약 n을 x로 나눈 나머지값이 1이면
            if(n % x ==1){
                // x 값을 answer에 대입한다
                answer = x
                // 반복문 종료 -> 가장 작은수 x return
                break
            }
        }
        return answer
    }
}