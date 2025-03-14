import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int ext_Index = 0;
        int sort_Index = 0;
        
        if (ext.equals("code")) {
            ext_Index = 0;
        } else if (ext.equals("date")) {
            ext_Index = 1;
        } else if (ext.equals("maximum")) {
            ext_Index = 2;
        } else if (ext.equals("remain")) {
            ext_Index = 3;
        }
        
        if (sort_by.equals("code")) {
            sort_Index = 0;
        } else if (sort_by.equals("date")) {
            sort_Index = 1;
        } else if (sort_by.equals("maximum")) {
            sort_Index = 2;
        } else if (sort_by.equals("remain")) {
            sort_Index = 3;
        }
        
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i][ext_Index] < val_ext) {
                list.add(data[i]);
            }
        }
        
        int[][] answer;
        answer = list.toArray(new int[list.size()][]);
        
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[i][sort_Index] > answer[j][sort_Index]) {
                    int[] temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        return answer;
    }
}

