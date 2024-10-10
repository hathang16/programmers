import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.trim().split("x");
        
        List<String> list = new ArrayList<>();
        
        for (String str : temp) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}