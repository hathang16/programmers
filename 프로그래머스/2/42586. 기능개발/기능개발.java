import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            q.offer(day);
        }        
        
        List<Integer> list = new ArrayList<>();
        
        while (!q.isEmpty()) {
            int p = q.poll();
            int c = 1;
            
            while (!q.isEmpty() && q.peek() <= p) {
                q.poll();
                c++;
            }
            list.add(c);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}