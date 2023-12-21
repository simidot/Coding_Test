import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            int idx = 1;
            for(int j=0; j<answer.length; j++) {
                if (emergency[i] < emergency[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}