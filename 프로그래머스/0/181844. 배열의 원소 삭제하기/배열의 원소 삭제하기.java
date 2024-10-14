import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        for (int i = 0; i < delete_list.length; i++) {
            answer.remove(Integer.valueOf(delete_list[i]));
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}