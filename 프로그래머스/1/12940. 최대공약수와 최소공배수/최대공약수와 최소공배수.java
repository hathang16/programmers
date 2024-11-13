class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        while (min != 0){
            int temp = min;
            min = max%min;
            max = temp;
        }
        
        int a = max;
        int b = (n*m)/a;
        
        int[] answer = {a,b};
        return answer;
    }
}