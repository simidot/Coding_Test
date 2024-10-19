import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 1;

        // 명함을 수납할 수 있는 가장 작은 지갑
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        for (int i = 0; i < 2; i++) {
            int max = 0;
            for (int j = 0; j < sizes.length; j++) {
                if (sizes[j][i] > max) {
                    max = sizes[j][i];
                }
            }
            answer *= max;

        }
        return answer;
    }
}