class Solution {
    
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    public int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            }
            
            return 0;
        }
        
        int c_1 = dfs(numbers, target, index + 1, sum + numbers[index]);
        int c_2 = dfs(numbers, target, index + 1, sum - numbers[index]);
        
        return c_1 + c_2;
    }
}