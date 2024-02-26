class Solution {
    public int solution(int n) {
        int answer = 0;

        String tri = Integer.toString(n, 3);
        char[] triArr = tri.toCharArray();
        char[] reverseArr = new char[triArr.length];
        int index = reverseArr.length - 1;
        for (char c : triArr) {
            reverseArr[index--] = c;
        }
        
        tri = new String(reverseArr);
        answer = Integer.parseInt(tri, 3);
        
        return answer;
    }
}