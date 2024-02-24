class Solution {
    public int solution(int n) {
        int answer = 0;

        // n 이하의 숫자 i로 나눠 떨어지는 수의 합 answer
        // 1. 1부터 N 이하로 반복문
        // 2. i로 나누었을 때 나머지 0 조건 걸기
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}