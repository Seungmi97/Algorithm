class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        answer = countPrime(nums, 0, 0, 0, 0, answer);

        return answer;
    }

    int countPrime(int[] nums, int sum, int start_index, int index, int depth, int count) {
        sum += nums[index];

        while (depth < 2){
            if (++index < nums.length) {
                count = countPrime(nums, sum, start_index, index, ++depth, count);
                depth--;
                if (depth == -1) {
                    return count;
                }
            } else if (depth == 0) {
                if (start_index < nums.length - 3) {
                    index = start_index++;
                    sum = 0;
                    depth = -1;
                } else {
                    return count;
                }
            } else {
                return count;
            }
        }
        if (isPrimeNumber(sum)) {
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