class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] ch = phone_number.toCharArray();

        for (int i = ch.length - 5; i >= 0; i--) {
            ch[i] = '*';
        }
        answer = String.valueOf(ch);

        return answer;
    }
}