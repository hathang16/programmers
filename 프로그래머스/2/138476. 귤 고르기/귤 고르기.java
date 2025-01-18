import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int max = 0;
        
        for (int i = 0; i < tangerine.length; i++) {
            if(tangerine[i] > max) {
                max = tangerine[i];
            }
        }
        
        int[] c = new int[max+1];
        for (int i = 0; i < tangerine.length; i++) {
            c[tangerine[i]]++;
        }
        
        List<Integer> C = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0) {
                C.add(c[i]);
            }
        }
        Collections.sort(C,Collections.reverseOrder());
        
        int total = 0;
        for (int i = 0; i < c.length; i++) {
            total = total + C.get(i);
            answer++;
            if (total >= k) {
                break;
            }
        }
        
        return answer;
    }
}