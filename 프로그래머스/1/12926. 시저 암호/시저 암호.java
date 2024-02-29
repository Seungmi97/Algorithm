class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] + n > 'z') {
                chars[i] = (char) (chars[i] + n - 'z' + 'a' - 1);
            } else if (chars[i] <= 'Z' && chars[i] + n > 'Z') {
                chars[i] = (char) (chars[i] + n - 'Z' + 'A' - 1);
            } else if (chars[i] == ' ') {
                continue;
            } else {
                chars[i] = (char) (chars[i] + n);
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }
}