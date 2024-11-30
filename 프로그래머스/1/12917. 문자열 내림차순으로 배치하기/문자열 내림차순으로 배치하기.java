import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        
        Arrays.sort(charArray);
        
        String answer = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            answer += charArray[i];
        }
        
        return answer;
    }
}