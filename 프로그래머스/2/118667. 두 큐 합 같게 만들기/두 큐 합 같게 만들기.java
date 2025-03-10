import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0, sum2 = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        long sum = sum1 + sum2;
        
        if (sum % 2 != 0) {
            return -1;
        }
        
        int left = 0, right = 0;
        int max = queue1.length * 2;
        
        while (left <= max && right <= max) {
            if (sum1 == sum / 2) {
                return answer;
            }
            
            if (sum1 > sum / 2) {
                sum1 -= q1.peek();
                q2.add(q1.poll());
                left++;
            } else {
                sum1 += q2.peek();
                q1.add(q2.poll());
                right++;
            }
            answer++;
        }
        return -1;
    }
}