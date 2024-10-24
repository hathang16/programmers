class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = f(balls,share);
        return answer;
    }
    
    public static int f(int n, int r) {
        if (n==r || r ==0){
            return 1;
        }else {
            return f(n-1, r-1) + f(n-1, r);
        }
    }
}