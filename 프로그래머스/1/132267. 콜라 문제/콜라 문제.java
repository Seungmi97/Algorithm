class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int have = n;
        while (have >= a) {
            have = have - a + b;
            answer += b;
        }

        return answer;
    }
}