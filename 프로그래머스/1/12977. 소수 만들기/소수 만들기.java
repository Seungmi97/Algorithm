class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        answer = sum(nums, 0, 0, 0, 0, answer);

        return answer;
    }

    int sum(int[] nums, int res, int start, int index, int depth, int count) {
        res += nums[index];

        while (depth < 2){
            if (++index < nums.length) {
                count = sum(nums, res, start, index, ++depth, count);
                depth--;
                if (depth == -1) {
                    return count;
                }
            } else if (depth == 0) {
                if (start < nums.length - 3) {
                    index = start++;
                    res = 0;
                    depth = -1;
                } else {
                    return count;
                }
            } else {
                return count;
            }
        }
        if (isPrimeNumber(res)) {
            count++;
        }

        return count;
    }

    public boolean isPrimeNumber(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count <= 2;
    }
}
