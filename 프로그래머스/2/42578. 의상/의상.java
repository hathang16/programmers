import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> Hash = new HashMap<>( );
        
        for (int i = 0; i < clothes.length; i++) {
            String t = clothes[i][1];
            
            Hash.put(t, Hash.getOrDefault(t,0) + 1);
            
        }
        
        List<Integer> c_c = new ArrayList<>(Hash.values());
        
        int answer = 1;
        
        for (int i = 0; i < c_c.size(); i++) {
            answer *= (c_c.get(i) + 1);
        }
        
        return answer - 1;
    }
}