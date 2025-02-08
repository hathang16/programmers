import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            String k = keymap[i];
            for (int j = 0; j < k.length(); j++) {
                char c = k.charAt(j);
                if (map.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), j + 1));
                } else {
                    map.put(c, j + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            boolean b = true;
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if (!map.containsKey(c)) {
                    b = false;
                    break;
                }
                
                count += map.get(c);
            }
            
            if (b) {
                answer[i] = count;
            } else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}