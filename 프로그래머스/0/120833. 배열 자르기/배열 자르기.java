class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int index = 0;
        int[] answer = new int[num2 - num1 + 1];
        
        for(int i = num1; i <= num2; i++){
            answer[index] = numbers[i];
            index++;
        }      
        
        return answer;
    }
}

// class Solution {
//     public int[] solution(int[] numbers, int num1, int num2) {

// int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
//         return answer;
//     }
// }