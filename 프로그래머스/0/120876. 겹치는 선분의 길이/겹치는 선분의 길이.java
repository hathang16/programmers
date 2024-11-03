class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] coverage = new int[200];
        
        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            for (int j = start; j < end; j++) {
                coverage[j]++;
            }
        }

        for (int i = 0; i < coverage.length; i++) {
            if (coverage[i] > 1) {
                answer++;
            }
        }

        return answer;
    }
}
