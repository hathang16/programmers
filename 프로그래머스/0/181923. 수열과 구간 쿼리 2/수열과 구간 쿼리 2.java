import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for (int j=0; j<queries.length; j++){
            int[] query = queries[j];
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++){
                if ( k < arr[i]){
                    answer[j] = answer [j] == -1 ? arr[i] : Math.min(answer[j], arr[i]);
                }
            }
        }
        
        return answer;
    }
}