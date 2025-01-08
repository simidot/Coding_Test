import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int[] xs = new int[dots.length];
        int[] ys = new int[dots.length];
        
        for (int i=0; i<dots.length; i++) {
            xs[i] = dots[i][0];
            ys[i] = dots[i][1];
        }
        
        Arrays.sort(xs);
        Arrays.sort(ys);
        
        answer = (xs[dots.length-1] - xs[0]) * (ys[dots.length-1] - ys[0]);
        
        return answer;
    }
}