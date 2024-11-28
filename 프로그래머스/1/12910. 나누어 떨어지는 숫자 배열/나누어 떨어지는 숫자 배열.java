import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int c = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                c++;
            }
        }
        if (c == 0) {
            return new int[] {-1};
        }
        
        int[] answer = new int[c];
        int index = 0; 
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}