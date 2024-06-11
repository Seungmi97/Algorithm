import java.util.ArrayList;

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

        ArrayList<Integer> winner = new ArrayList<>();
        int maxScore = Math.max(Math.max(score1, score2), score3);
        if (maxScore == score1) winner.add(1);
        if (maxScore == score2) winner.add(2);
        if (maxScore == score3) winner.add(3);
        
        int[] answer = new int[winner.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = winner.get(i);
        }
        
        return answer;
    }
}