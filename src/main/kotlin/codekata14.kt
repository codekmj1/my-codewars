// 문제 14. 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.



class Solution14 {
    fun solution(n: Int): Int {
        var answer = 0
        // 1부터 n까지 for문
        for (i in 1..n){
            // 만약 n을 i로 나눈 나머지가 0이면 -> i가 n의 약수이면
            // i + answer 값을 변수 answer에 대입한다
            if (n % i ==0)answer += i
        }
        return answer
    }
}
