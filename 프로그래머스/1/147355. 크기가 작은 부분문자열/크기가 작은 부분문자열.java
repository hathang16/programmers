import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long n = Long.parseLong(p);
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i <= t.length()-p.length(); i++) {
            list.add(t.substring(i,i+p.length()));
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (Long.parseLong(list.get(i)) <= n) {
                answer++;
            }
        }
        
        
        return answer;
    }
}