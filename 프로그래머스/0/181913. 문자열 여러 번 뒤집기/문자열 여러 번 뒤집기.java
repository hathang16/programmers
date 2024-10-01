import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        char temp;
        
        for (int i=0; i< queries.length;i++){
            for(int j=queries[i][0]; j<=(queries[i][0]+queries[i][1])/2; j++){
                temp = arr[j];
                arr[j] = arr[queries[i][0]+queries[i][1]-j];
                arr[queries[i][0]+queries[i][1]-j] = temp;
            }
        }
        return String.valueOf(arr);
    }
}