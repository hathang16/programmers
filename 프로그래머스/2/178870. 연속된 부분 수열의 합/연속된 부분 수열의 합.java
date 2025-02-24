class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int s = 0, e = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        
        while (e < sequence.length) {
            sum += sequence[e];
            
            while (sum > k && s <= e) {
                sum -= sequence[s];
                s++;
            }
            
            if (sum == k) {
                if (e - s < minLen) {
                    minLen = e - s;
                    answer[0] = s;
                    answer[1] = e;
                }
            }
            e++;
        }
        
        return answer;
    }
}