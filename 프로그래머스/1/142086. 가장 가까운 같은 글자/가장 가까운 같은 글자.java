class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (chars[i] == chars[j]) {
                    answer[i] = i - j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }

        return answer;
    }
}