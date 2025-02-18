import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> bro_1 = new HashMap<>();
        Set<Integer> bro_2 = new HashSet<>();
        
        for (int i = 0; i < topping.length; i++) {
            if (bro_1.containsKey(topping[i])) {
                bro_1.put(topping[i], bro_1.get(topping[i]) + 1);
            } else {
                bro_1.put(topping[i], 1);
            }
        }
        
        for (int i = 0; i < topping.length; i++) {
            bro_1.put(topping[i], bro_1.get(topping[i]) - 1);
            
            if (bro_1.get(topping[i]) == 0) {
                bro_1.remove(topping[i]);
            }
            
            bro_2.add(topping[i]);
            
            if (bro_1.size() == bro_2.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}