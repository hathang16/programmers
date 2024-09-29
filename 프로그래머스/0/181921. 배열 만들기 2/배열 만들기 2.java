import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
         ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = l; i<=r; i++){
            if(A(i)){
                list.add(i);
            }
        }
        
        if(list.isEmpty()){
            return new int[] {-1};
        }
        
        return list.stream().mapToInt(i-> i).toArray();
    }
    
    private boolean A(int num){
        
        if (num == 0) {
            return false;
        }

        while (num > 0) {
            int b = num % 10;
            if (b != 0 && b != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}