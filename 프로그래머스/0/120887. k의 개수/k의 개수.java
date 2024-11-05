class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String target = String.valueOf(k);
        
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num);
            for (int l = 0; l < numStr.length(); l++) {
                if (numStr.charAt(l) == target.charAt(0)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}