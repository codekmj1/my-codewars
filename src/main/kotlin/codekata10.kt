// 문제 10. 정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 원소의 평균값을 return하도록 solution
// 함수를 완성해주세요.

class Solution10 {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        // 주어진 배열 numbers의 모든 원소를 더한다
        for (number in numbers) {
            answer += number
        }
        // 배열 크기인 numbers.size로 나눠서 평균을 구한다
        return answer / numbers.size
    }
}