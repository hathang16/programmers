import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> list = new ArrayList<>();
        
        for (int i=0; i<my_string.length(); i+=m){
            String sb = my_string.substring(i,i+m);
            list.add(sb);
        }        
        String answer = "";
        for (int i=0;i<list.size(); i++){
            answer += list.get(i).charAt(c-1);
        }
        return answer;
    }
}