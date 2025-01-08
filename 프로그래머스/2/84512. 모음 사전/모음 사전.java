class Solution {
    public int solution(String word) {
        int answer = 0;
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        // 자리별 가중치 계산: 5^i + 5^(i-1) + ... + 1
        int[] weights = new int[5];
        int base = 1;
        for (int i = 4; i >= 0; i--) {
            weights[i] = base;
            base = base * 5 + 1;
        }
        
        // 단어의 위치 계산
        for (int i = 0; i < word.length(); i++) {
            int index = 0;
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    index = j;
                    break;
                }
            }
            answer += index * weights[i] + 1; // 위치 계산
        }
        
        return answer;
    }
}
