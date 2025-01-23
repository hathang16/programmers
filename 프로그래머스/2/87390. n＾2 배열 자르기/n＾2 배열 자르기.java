class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)right - (int)left;
        int[] answer = new int[len + 1];
        
        int index = 0;
        for (long i = left; i < right + 1; i++) {
            long row = i / n;
            long col = i % n;
            answer[index] = Math.max((int)row, (int)col) + 1;
            index++;
        }
        
        return answer;
    }
}