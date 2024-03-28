class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int cards1Index = 0;
        int cards2Index = 0;
        for (String goalWord : goal) {
            if (cards1Index < cards1.length && goalWord.equals(cards1[cards1Index])) {
                cards1Index++;
                continue;
            }
            if (cards2Index < cards2.length && goalWord.equals(cards2[cards2Index])) {
                cards2Index++;
                continue;
            }
            answer = "No";
        }

        return answer;
    }
}