class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c >= '0' && c <= '9') {
                    continue;
                } else {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }
        
        return answer;
    }
}