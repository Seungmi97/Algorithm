import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            int[] winner = Arrays.copyOf(score, i + 1);
            Arrays.sort(winner);
            if (i < k) {
                answer[i] = winner[0];
            } else {
                answer[i] = winner[winner.length - k];
            }
        }

        return answer;
    }
}