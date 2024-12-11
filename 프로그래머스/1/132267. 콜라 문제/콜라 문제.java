class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            
            int new_bottle = (n/a) *b;
            
            int old_bottle = (n/a) *a;
            
            answer += new_bottle;
            
            n = n - old_bottle + new_bottle;
        }
        return answer;
    }
}