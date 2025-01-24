class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int h = 3; h <= brown + yellow; h++) {
            int w = (brown + yellow) / h;
            
            if ((w - 2) * (h - 2) == yellow) {
                answer[0] = w;
                answer[1] = h;
                break;
            }
            
        }
        
        return answer;
    }
}