class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            boolean flag = false;
            for (int n : numbers) {
                if (n == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer += i;
            }
        }

        return answer;
    }
}