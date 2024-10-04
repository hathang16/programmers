class Solution {
    public int[] solution(int[] arr) {
        
        int a = -1;
        int b = 1;
        
        for (int i=0; i<arr.length;i++){
            if (arr[i] ==2){
                if (a == -1){
                    a =i;
                }
                b =i;
            }
        }
        
        if (a == -1){
            return new int[]{-1};
        }
        
        int[] answer = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            answer[i - a] = arr[i];
        }

        return answer;
    }
}