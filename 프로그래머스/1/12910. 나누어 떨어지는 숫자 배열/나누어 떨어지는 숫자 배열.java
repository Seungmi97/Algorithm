import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return answer;
    }
}