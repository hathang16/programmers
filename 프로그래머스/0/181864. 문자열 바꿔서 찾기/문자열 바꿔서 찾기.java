class Solution {
    public int solution(String myString, String pat) {
        String answer = myString.replace("A","C")
                                .replace("B","A")
                                .replace("C","B");
        
        if (answer.contains(pat)){
            return 1;
        } else {
            return 0;
        }
    }
}