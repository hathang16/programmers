class Solution {
    public String solution(int a, int b) {
        int[] Month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] Week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        for (int i = 1; i < a; i++){
            b += Month[i];
        }
        
        String answer = Week[(b + 4) % 7];
        return answer;
    }
}