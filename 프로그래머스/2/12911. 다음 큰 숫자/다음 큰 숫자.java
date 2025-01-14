class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_c = Integer.bitCount(n);
        int b_c = 0;
        
        for (int i = n+1; i < 1000000; i++) {
            b_c = Integer.bitCount(i);
            
            if (n_c == b_c) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}