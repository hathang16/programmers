class Solution {
    public int[] solution(String[] wallpaper) {
        
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for (int i =0; i < wallpaper.length; i++) {
            String row = wallpaper[i];
            for (int j=0; j < row.length(); j++) {
                if (row.charAt(j) == '#') {
                    if (i < lux) lux = i;
                    if (j < luy) luy = j;
                    
                    if (i + 1 > rdx) rdx = i + 1;
                    if (j + 1 > rdy) rdy = j + 1;
                }
            }
        }
        
        int[] answer = {lux,luy,rdx,rdy};
        return answer;
    }
}