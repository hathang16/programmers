class Solution {
    public int solution(int n, int k) {
        
        String converte = Integer.toString(n,k);
        
        String[] nums = converte.split("0");
        
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].isEmpty()) {
                continue;
            }
            
            long num = Long.parseLong(nums[i]);
            
            if (isPrime(num)){
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false;
        long sqrt = (long) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}