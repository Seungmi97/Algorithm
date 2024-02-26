import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        List<Integer> nlist = new ArrayList<>();
        List<Integer> mlist = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                nlist.add(i);
            }
        }
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                mlist.add(i);
            }
        }

        boolean find = false;
        for (int i = nlist.size() - 1; i >= 0; i--) {
            for (int ml : mlist) {
                if (nlist.get(i) == ml) {
                    answer[0] = ml;
                    find = true;
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}