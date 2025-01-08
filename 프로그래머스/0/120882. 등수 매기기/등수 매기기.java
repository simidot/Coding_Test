import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        int[] average = new int[score.length];
        for (int i=0; i<score.length; i++) {
            average[i] = score[i][0] + score[i][1];
        }
        
        for (int i=0; i<score.length; i++) {
            int idx = 1;
            for (int j=0; j<score.length; j++) {
                if (average[i] < average[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }

        return answer;
    }
}