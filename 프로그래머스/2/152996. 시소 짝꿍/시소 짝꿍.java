import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        Map<Double, Integer> m = new HashMap<>();
        
        for (int i = 0; i < weights.length; i++) {
            double a = weights[i] * 1.0;
            double b = (weights[i] * 2.0) / 3.0;
            double c = (weights[i] * 1.0) / 2.0;
            double d = (weights[i] * 3.0) / 4.0;
            
            if (m.containsKey(a)) {
                answer += m.get(a);
            }
            if (m.containsKey(b)) {
                answer += m.get(b);
            }
            if (m.containsKey(c)) {
                answer += m.get(c);
            }
            if (m.containsKey(d)) {
                answer += m.get(d);
            }
            
            m.put(a, m.getOrDefault(a, 0) +1);
        }
        
        return answer;
    }
}