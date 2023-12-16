// 문제 11. 정수 num이 짝수일 경우 "Even"을 반환하고
// 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

// 제한조건
// num은 int 범위의 정수입니다.
// 0은 짝수입니다.

class Solution11 {
    fun solution(num: Int): String {
        var answer = ""
        // num이 짝수이거나 0이면 answer = Even
        if(num%2==0 || num==0)answer="Even"
        // 아니면 answer = Odd
        else answer="Odd"
        return answer
    }
}