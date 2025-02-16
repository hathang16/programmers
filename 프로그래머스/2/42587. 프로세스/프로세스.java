import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        int answer = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }
        
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            boolean b = false;
            
            for (int i = 0; i < queue.size(); i++) {
                int[] process = queue.poll();
                if (process[0] > p[0]) {
                    b = true;
                }
                queue.add(process);
            }
            
            if (b) {
                queue.add(p);
            } else {
                answer++;
                
                if (p[1] == location) {
                    break;
                }
            }
        }
        
        return answer;
    }
}