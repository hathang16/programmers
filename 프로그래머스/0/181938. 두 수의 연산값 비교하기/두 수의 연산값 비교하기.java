class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a) + String.valueOf(b);
        int c = (2*a*b);
        
        if (Integer.parseInt(ab) >= c) {
            return Integer.parseInt(ab);
        } else {
            return c;
        }
    }
}