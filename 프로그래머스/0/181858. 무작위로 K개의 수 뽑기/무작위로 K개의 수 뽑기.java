import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        HashSet<Integer> set = new HashSet<>(); 
        
        int c =0;
        for (int i=0; i<arr.length; i++){
            if (!set.contains(arr[i])){
                set.add(arr[i]);
                answer[c] = arr[i];
                c++;
            }
            
            if (c == k){
                break;
            }
        }
        
        for (int i=c; i<k; i++){
            answer[i] = -1;
        }
        
        return answer;
    }
}