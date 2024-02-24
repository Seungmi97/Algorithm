import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);
        char[] c = str.toCharArray();
        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
            answer += Long.parseLong(String.valueOf(c[i])) * (long)Math.pow(10, i);
        }

        return answer;
    }
}