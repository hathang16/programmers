import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - days; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            
            for (int j = i; j < i + days; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            if (map.equals(discountMap)) {
                answer++;
            }
        }
        
        return answer;
    }
}