class Solution {
    public int solution(int num) {
        int answer = 0;

        long lnum = num;

        while (lnum != 1) {
            lnum = (lnum % 2 == 0)? lnum / 2 : lnum * 3 + 1;
            answer++;

            if (answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}