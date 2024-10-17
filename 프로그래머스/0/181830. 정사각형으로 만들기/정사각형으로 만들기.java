class Solution {
    public int[][] solution(int[][] arr) {
        
        int a = arr.length;
        int b = arr[0].length;
        
        if ( a > b ){
            int[][] answer = new int[a][a];
            for (int i=0; i<a; i++){
                for (int j=0; j<b; j++){
                    answer[i][j] = arr[i][j];
                } 
                answer[i][b] = 0;
            }
            return answer;
        } else if ( a < b ){
            int[][] answer = new int[b][b];
            for (int i=0; i<b; i++){
                for (int j=0; j<a; j++){
                    answer[j][i] = arr[j][i];
                } 
                answer[a][i] = 0;
            }
            return answer;
        } else {
            return arr;
        }
    }
}