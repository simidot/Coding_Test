import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        // 음이 아닌 정수들
        // 순서를 바꾸지 않고 더하거나 빼서 타겟 넘버를 만들려고 한다.
        // 타겟 넘버를 만드는 방법의 수

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        for (int i = 0; i < numbers.length; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int sum = queue.poll();
                queue.add(sum + numbers[i]);
                queue.add(sum - numbers[i]);
            }
        }

        while (!queue.isEmpty()) {
            if (queue.poll() == target) {
                answer ++;
            }
        }
        
        return answer;
    }
}