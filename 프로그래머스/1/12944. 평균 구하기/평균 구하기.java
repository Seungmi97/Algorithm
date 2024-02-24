class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        // arr 배열 내의 인자들을 answer에 하나씩 더하자!
        // for문 사용! (향상된 for문)
        for (int i : arr) {
            answer += i;
        }
        // answer(sum)를 arr의 길이만큼 나눠보자!
        return answer / arr.length;
    }
}