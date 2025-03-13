import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        ArrayList<int[]> room = new ArrayList<>();
        int answer = 0;
        
        Arrays.sort(book_time, (a, b) -> a[0].compareTo(b[0]));
        
        for (int i = 0; i < book_time.length; i++) {
            String[] start = book_time[i][0].split(":");
            String[] end = book_time[i][1].split(":");
            
            int s = Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]);
            int e = Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1]) + 10;
            
            boolean b = false;
            
            for (int j = 0; j < room.size(); j++) {
                if (room.get(j)[1] <= s) {
                    room.get(j)[0] = s;
                    room.get(j)[1] = e;
                    b = true;
                    break;
                }
            }
            
            if (!b) {
                room.add(new int[]{s,e});
            }
        }
        
        answer = room.size();
        return answer;
    }
}