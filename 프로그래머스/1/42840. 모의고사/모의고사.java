import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) score1++;
            if (answers[i] == student2[i % student2.length]) score2++;
            if (answers[i] == student3[i % student3.length]) score3++;
        }

        int[] winner = new int[3];
        if (score1 - score2 > 0) {
            if (score1 - score3 > 0) {
                winner[0] = 1;
                winner = Arrays.copyOf(winner, 1);
            }
            if (score1 - score3 == 0) {
                winner[0] = 1;
                winner[1] = 3;
                winner = Arrays.copyOf(winner, 2);
            }
            if (score1 - score3 < 0) {
                winner[0] = 3;
                winner = Arrays.copyOf(winner, 1);
            }
        }
        if (score1 - score2 == 0) {
            if (score1 - score3 > 0) {
                winner[0] = 1;
                winner[1] = 2;
                winner = Arrays.copyOf(winner, 2);
            }
            if (score1 - score3 == 0) {
                winner[0] = 1;
                winner[1] = 2;
                winner[2] = 3;
            }
            if (score1 - score3 < 0) {
                winner[0] = 3;
                winner = Arrays.copyOf(winner, 1);
            }
        }
        if (score1 - score2 < 0) {
            if (score2 - score3 > 0) {
                winner[0] = 2;
                winner = Arrays.copyOf(winner, 1);
            }
            if (score2 - score3 == 0) {
                winner[0] = 2;
                winner[1] = 3;
                winner = Arrays.copyOf(winner, 2);
            }
            if (score2 - score3 < 0) {
                winner[0] = 3;
                winner = Arrays.copyOf(winner, 1);
            }
        }

        return winner;
    }
}