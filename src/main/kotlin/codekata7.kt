// 문제 7. 정수 num1과 num2가 매개변수로
// 주어질 때, num1을 num2로 나눈 값에 1,000을
// 곱한 후 정수 부분을 return 하도록 soltuion
// 함수를 완성해주세요.

class Solution7 {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        // 변수 answer에 다음 식을 대입한다
        // num1을 double로 형변환해서 num2로 나눈 값을 * 1000
        // 그리고 다시 int로 형변환
        // 형변환을 하지 않으면 정수 부분만 읽기 때문
        answer = (num1.toDouble() / num2 * 1000).toInt()
        return answer
    }
}