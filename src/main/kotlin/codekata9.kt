// 문제 9. 정수 n이 주어질 때,
// n이하의 짝수를 모두 더한 값을 return 하도록
// solution 함수를 작성해주세요.


class Solution9 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        //먼저 반복문 for을 사용하여 n의 범위를
        // 1부터 n까지 설정 합니다
        for( n in 1..n ){
            // n이 짝수이면 answer에 answer+n식을 대입합니다
            // 반복문이 종료되면 answer 값을 반환합니다
            if(n%2==0){
                answer += n
            }
        }
        return answer
    }
}