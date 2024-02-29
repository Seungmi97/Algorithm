class Solution {
    public int solution(int[][] sizes) {
        int max_width = 0;
        int max_height = 0;
        
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            max_width = Math.max(max_width, size[0]);
            max_height = Math.max(max_height, size[1]);
        }
        
        return max_width * max_height;
    }
}