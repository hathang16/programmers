import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = files.clone();
        
        Arrays.sort(answer, (a, b) -> {
            String regex = "(\\D+)(\\d+)(.*)";
            Pattern pattern = Pattern.compile(regex);
            
            Matcher matcherA = pattern.matcher(a);
            Matcher matcherB = pattern.matcher(b);

            if (matcherA.matches() && matcherB.matches()) {
                String headA = matcherA.group(1).toLowerCase();
                String headB = matcherB.group(1).toLowerCase();

                int numA = Integer.parseInt(matcherA.group(2));
                int numB = Integer.parseInt(matcherB.group(2));

                if (!headA.equals(headB)) {
                    return headA.compareTo(headB);
                } else {
                    return Integer.compare(numA, numB);
                }
            } else {
                return 0;
            }
        });

        return answer;
    }
}
