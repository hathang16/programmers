class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // 모두 홀수
        if (a % 2 != 0 && b % 2 != 0){
            answer = a*a + b*b;
        } 
        // 모두 짝수 (절댓값)
        else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } // 반반
        else {
            answer = 2 * (a+b);
        }
        
        return answer;
    }
}