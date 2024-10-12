import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] c = new int[30];
        
        for (int i=0; i<strArr.length; i++){
            int l = strArr[i].length();
            c[l -1]++;
        }
        
        for (int i=0; i < c.length; i++){
            if (c[i] > answer){
                answer = c[i];
            }
        }
        return answer;
    }
}