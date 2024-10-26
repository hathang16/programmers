class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        answer = answer.replace("a", "");
        answer = answer.replace("e", "");
        answer = answer.replace("i", "");
        answer = answer.replace("o", "");
        answer = answer.replace("u", "");
        return answer;
    }
}

// class Solution {
//     public String solution(String my_string) {
//         return my_string.replaceAll("[aeiou]", "");
//     }
// }