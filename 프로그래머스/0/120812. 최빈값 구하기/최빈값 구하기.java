import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        int m = array[array.length - 1];
        int[] c = new int[m + 1];
        
        for (int i = 0; i < array.length; i++){
                c[array[i]] ++;
        }
        
        int top = c[0];
        
        for (int i = 1; i < c.length; i++){
            if( top < c[i] ) {
                top = c[i];
                answer = i;
            } else if (top == c[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}