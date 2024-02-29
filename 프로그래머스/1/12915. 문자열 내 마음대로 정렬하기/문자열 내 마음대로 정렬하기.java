import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        boolean ischange = false;

        do {
            ischange = false;
            for (int i = 0; i < strings.length - 1; i++) {
                if (strings[i].charAt(n) > strings[i + 1].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = temp;

                    ischange = true;
                } else if (strings[i].charAt(n) == strings[i + 1].charAt(n)) {
                    String temp = strings[i];
                    Arrays.sort(strings, i, i + 2);
                    if (!strings[i].equals(temp)) {
                        ischange = true;
                    }
                }
            }
        } while (ischange);

        return strings;
    }
}