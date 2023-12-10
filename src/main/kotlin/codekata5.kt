// 문제 5. 정수 num1과 num2가 매개변수로 주어집니다.
// 두 수가 같으면 1 다르면 -1을 retrun하도록
// solution 함수를 완성해주세요.


class Solution5 {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        // 조건문 if - else 사용
        if (num1 == num2 ){
            answer = 1
        }
        else {
            answer = -1
        }
        return answer
    }
}