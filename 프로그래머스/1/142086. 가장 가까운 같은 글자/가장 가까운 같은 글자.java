import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] last = new int[128];
        Arrays.fill(last,-1);
        
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if (last[c] == -1){
                answer[i] =-1;
            } else {
                answer[i] = i-last[c];
            }
            
            last[c] = i;
        }        
        
        return answer;
    }
}