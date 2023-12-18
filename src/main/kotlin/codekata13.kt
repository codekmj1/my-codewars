//문제 13. 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서
// return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

class Solution13 {
    fun solution(n: Int): Int {
        var answer = 0
        //인자로 받은 Int 값을 String으로 변환하여 각 문자열을 문자 배열로 받아 for 문으로 돌려 '0' 문자를 빼서
        //Int로 다시 변환하여 answer 변수에 더해 담아 출력했다.
        for(i in n.toString().toCharArray() ) answer+=(i-'0')


        return answer
    }
}