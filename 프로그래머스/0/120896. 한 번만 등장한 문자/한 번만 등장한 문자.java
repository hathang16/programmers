import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        Arrays.sort(str);
        
        for (int i=0; i<str.length; i++){
            int c=0;
            for (int j=0; j<str.length; j++){
                if(str[i].equals(str[j])){
                    c ++;
                }
            }
            if (c == 1){
                answer += str[i];
            }
        }
        
        return answer;
    }
}