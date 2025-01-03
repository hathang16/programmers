import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] S = s.split(" ");
        
        int min = Integer.parseInt(S[0]);
        int max = Integer.parseInt(S[0]);
        
        for (int i = 0; i < S.length; i++) {
            int index = Integer.parseInt(S[i]);
            if (index < min) {
                min = index;
            }
            if (index > max) {
                max = index;
            }
        }
        String answer = min + " " + max;
        return answer;
    }
}