import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        HashSet<String> set = new HashSet<String>();
        int now_x = 0;
        int now_y = 0;
        
        for (int i = 0; i < dirs.length(); i++) {
            int next_x = now_x;
            int next_y = now_y;
            String road = "";
            
            if (dirs.charAt(i) == 'U') {
                next_y++;  
                road = "" + now_x + now_y + next_x + next_y;
            } else if (dirs.charAt(i) == 'D') {
                next_y--;
                road = "" + next_x + next_y + now_x + now_y;
            } else if (dirs.charAt(i) == 'R') {
                next_x++;
                road = "" + now_x + now_y + next_x + next_y;
            } else if (dirs.charAt(i) == 'L') {
                next_x--;
                road = "" + next_x + next_y + now_x + now_y;
            }
            
            if (next_x < -5 || next_x > 5 || next_y < -5 || next_y > 5) {
                continue;
            }
            
            set.add(road);
            now_x = next_x;
            now_y = next_y;
        } 
        answer = set.size();
        return answer;
    }
}