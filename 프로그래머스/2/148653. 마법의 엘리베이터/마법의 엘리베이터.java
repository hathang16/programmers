class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int num = storey % 10;
            int nextnum = (storey / 10) % 10;
            
            if (num > 5) {
                answer += (10 - num);
                storey += 10;
            } else if (num == 5) {
                if (nextnum >= 5) {
                    answer += (10 - num);
                    storey += 10;
                } else {
                    answer += num;
                }
            } else {
                answer += num;
            }
            
            storey /= 10;
        }
        
        return answer;
    }
}