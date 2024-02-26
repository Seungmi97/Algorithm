import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        char[] reverse = new char[c.length];
        int index = c.length - 1;
        for (char ch : c) {
            reverse[index--] = ch;
        }
        answer = String.valueOf(reverse);
        
        return answer;
    }
}