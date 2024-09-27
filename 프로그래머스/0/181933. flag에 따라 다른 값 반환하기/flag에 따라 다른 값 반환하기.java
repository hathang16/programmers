class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if (flag == false){
            return (a)-b;
        } 
        else{
            return (a)+b;
        }
    }
}