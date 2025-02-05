import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        Queue<String> c = new LinkedList<>();
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            if (c.remove(city)) {
                c.add(city);
                answer += 1;
            } else {
                if (c.size() == cacheSize) {
                    c.poll();
                    c.add(city);
                } else {
                    c.add(city);
                }
                answer += 5;
            }
        }
        
        return answer;
    }
}