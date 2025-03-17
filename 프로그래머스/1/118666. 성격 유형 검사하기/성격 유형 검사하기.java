import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for (int i = 0; i < types.length; i++) {
            map.put(types[i], 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int c = choices[i];

            if (c == 1) {
                map.put(s.charAt(0), map.get(s.charAt(0)) + 3);
            } else if (c == 2) {
                map.put(s.charAt(0), map.get(s.charAt(0)) + 2);
            } else if (c == 3) {
                map.put(s.charAt(0), map.get(s.charAt(0)) + 1);
            } else if (c == 5) {
                map.put(s.charAt(1), map.get(s.charAt(1)) + 1);
            } else if (c == 6) {
                map.put(s.charAt(1), map.get(s.charAt(1)) + 2);
            } else if (c == 7) {
                map.put(s.charAt(1), map.get(s.charAt(1)) + 3);
            }
        }
        
        String answer = "";
        
        if (map.get('R') >= map.get('T')) {
            answer += "R";
        } else {
            answer += "T";
        }

        if (map.get('C') >= map.get('F')) {
            answer += "C";
        } else {
            answer += "F";
        }

        if (map.get('J') >= map.get('M')) {
            answer += "J";
        } else {
            answer += "M";
        }

        if (map.get('A') >= map.get('N')) {
            answer += "A";
        } else {
            answer += "N";
        }

        return answer;
    }
}