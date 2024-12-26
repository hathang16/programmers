class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int c_paint = 0;
        
        for (int i =0; i < section.length; i++) {
            if(section[i] > c_paint) {
                answer++;
                c_paint = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}