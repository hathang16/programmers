import java.util.*;

//해쉬
// class Solution {
//     public int[] solution(int n, String[] words) {
//         int[] answer = new int[2];
//         HashSet<String> hash = new HashSet<>();
//         hash.add(words[0]); 
        
//         for (int i = 1; i < words.length; i++) {
//             String a = words[i-1];
//             String b = words[i];
            
//             if (a.charAt(a.length() - 1) != b.charAt(0) || hash.contains(b)) {
//                 answer[0] = (i % n) + 1;
//                 answer[1] = (i / n) + 1;
//                 return answer;
//             }
            
//             hash.add(b);
//         }

//         return answer;
//     }
// }

//배열
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String[] usedWords = new String[words.length];
        usedWords[0] = words[0];

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String current = words[i];

            if (prev.charAt(prev.length() - 1) != current.charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }

            for (int j = 0; j < i; j++) {
                if (usedWords[j].equals(current)) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    return answer;
                }
            }

            usedWords[i] = current;
        }

        return answer;
    }
}
