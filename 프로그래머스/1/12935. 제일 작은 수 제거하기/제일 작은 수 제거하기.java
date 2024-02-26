import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] sort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sort);

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sort[0]) {
                index = i;
                break;
            }
        }

        int[] answer = new int[arr.length - 1];
        System.arraycopy(arr, 0, answer, 0, index);
        System.arraycopy(arr, index + 1, answer, index, answer.length - index);

        return answer;
    }
}