class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ", -1);
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (j % 2 == 0) {
                    if (chars[j] >= 'a' && chars[j] <= 'z') {
                        chars[j] = (char) (chars[j] + ('A' - 'a'));
                    }
                } else {
                    if (chars[j] >= 'A' && chars[j] <= 'Z') {
                        chars[j] = (char) (chars[j] - ('A' - 'a'));
                    }
                }
            }
            arr[i] = String.valueOf(chars);
        }
        answer = String.join(" ", arr);

        return answer;
    }
}