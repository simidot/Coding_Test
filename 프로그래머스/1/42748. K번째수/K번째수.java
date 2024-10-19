import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 배열의 i번째 ~ j번째 자르고 정렬
        // k번째 수를 구하려 한다.
        for (int i = 0; i < commands.length; i++) {
            int[] q = commands[i];
            int[] cut = Arrays.stream(array, q[0]-1, q[1]).toArray();

            List<Integer> cutList = new ArrayList<>();
            for (int one : cut) {
                cutList.add(one);
            }
            Collections.sort(cutList);

            answer[i] = cutList.get(q[2] - 1);
        }
        
        return answer;
    }
}