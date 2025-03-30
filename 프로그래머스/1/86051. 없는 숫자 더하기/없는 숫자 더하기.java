class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int n = 0;
        
        for (int i = 0; i < numbers.length; i++){
            n += numbers[i];
        }
        
        return answer - n;
    }
}