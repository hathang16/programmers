import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        int todayInt = dateToInt(today);
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] parts = terms[i].split(" ");
            map.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        int c = 0;
        
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            int expireDate = dateToInt(parts[0]) + (map.get(parts[1]) * 28) - 1;
            
            if (expireDate < todayInt) {
                c++;
            }
        }

        int[] answer = new int[c];
        int index = 0;
        
        for (int i = 0; i < privacies.length; i++) {
         String[] parts = privacies[i].split(" ");
            int expireDate = dateToInt(parts[0]) + (map.get(parts[1]) * 28) - 1;

            if (expireDate < todayInt) {
                answer[index] = i + 1;
                index++;
            }
        }
        
        return answer;
    }
    
    private int dateToInt(String date) {
        String[] p = date.split("\\.");
        int y = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int d = Integer.parseInt(p[2]);
        return (y * 12 * 28) + (m * 28) + d;
    }
}