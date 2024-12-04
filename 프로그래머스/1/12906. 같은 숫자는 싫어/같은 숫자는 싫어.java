import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int prev = -1; // 초기값: arr의 값으로 나오지 않는 숫자 설정

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != prev) {
                result.add(arr[i]);
                prev = arr[i];
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
