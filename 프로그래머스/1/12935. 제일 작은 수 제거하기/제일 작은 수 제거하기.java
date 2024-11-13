class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length ==1) {
            int answer[] = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        int a = arr[0];       
        int index =0;
        
        for (int i=0; i<arr.length; i++) {
            a = Math.min(a, arr[i]);
        } 
        
        for (int i=0; i<arr.length; i++) {
            if ( arr[i] == a ) {
                continue;
            }
            
            answer[index++] = arr[i];
            
        }
        
        return answer;
    }
}