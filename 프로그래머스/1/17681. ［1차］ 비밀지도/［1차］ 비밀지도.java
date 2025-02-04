class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int or = arr1[i] | arr2[i];
            String s = Integer.toBinaryString(or);
            
            if (s.length() < n) {
                while (s.length() < n) {
                    s = "0" + s;
                }
            }
            
            s = s.replace('1' , '#').replace('0' , ' ');
            answer[i] = s;
        }
        
        return answer;
    }
}