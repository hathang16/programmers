import java.util.*;

class Solution {
    public int[] solution(int n) {
        int c =0;
        for(int i=1; i<=n; i++){
            if (n % i == 0){
                c++;
            }
        }
        
        int[] answer = new int[c];
        int index =0;
        
        for(int i=1; i<=n; i++){
            if (n % i ==0){
                answer[index++] = i;
            }
        }
        
        return answer;
    }
}