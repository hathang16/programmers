import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            dictionary.put(String.valueOf((char) ('A' + i)), i + 1);
        }
        
        int dictIndex = 27;
        int i = 0;
        
        while (i < msg.length()) {
            String w = "";
            String nextWord = "";
            
            while (i < msg.length()) {
                nextWord = w + msg.charAt(i);
                
                if (dictionary.containsKey(nextWord)) {
                    w = nextWord;
                    i++;
                } else {
                    break;
                }
            }
            
            output.add(dictionary.get(w));
            
            if (i < msg.length()) {
                dictionary.put(nextWord, dictIndex);
                dictIndex++;
            }
        }
        
        int[] answer = new int[output.size()];
        for (int j = 0; j < output.size(); j++) {
            answer[j] = output.get(j);
        }
        
        return answer;
    }
}
