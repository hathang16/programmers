import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] cX = new int[10];
        int[] cY = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            cX[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            cY[Y.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int c = Math.min(cX[i], cY[i]);
            for (int j = 0; j < c; j++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        
        if (answer.isEmpty()) {
            answer = "-1";
        }
        
        if (answer.startsWith("0")) {
            answer = "0";
        }
        
        return answer;
        
    }
}