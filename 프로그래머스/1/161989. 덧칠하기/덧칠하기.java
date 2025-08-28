import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        List<Integer> painted = new ArrayList<>();
        
        for(int i : section){
            if(painted.contains(i)) {
                continue;
            }
            for(int j = 0; j < m; j++){
               painted.add(i + j);
            }
            answer++;
        }
        
        return answer;
    }
}