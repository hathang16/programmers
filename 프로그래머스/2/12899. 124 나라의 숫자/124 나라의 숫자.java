class Solution {
    public String solution(int n) {
        String[] N = {"4","1","2"};
        String answer = "";
        
        while (n > 0) {
            int re = n % 3;
            n /= 3;
            
            if (re == 0) {
                n -= 1;
            }
            
            answer = N[re] + answer;
            
        }
        
        return answer;
    }
}