class Solution {
    public boolean solution(int x) {
        boolean answer = false;

        int sum = 0;
        char[] ch = String.valueOf(x).toCharArray();
        for (char c : ch) {
            sum += Integer.parseInt(String.valueOf(c));
        }

        if (x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}