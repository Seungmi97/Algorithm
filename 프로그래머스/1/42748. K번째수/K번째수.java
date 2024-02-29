import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;

        for (int[] command : commands) {
            int[] cut = new int[command[1] - command[0] + 1];
            int sIdx = command[0] - 1;
            for (int i = 0; i < cut.length; i++) {
                cut[i] = array[sIdx++];
            }
            Arrays.sort(cut);
            answer[index++] = cut[command[2] - 1];
        }

        return answer;
    }
}