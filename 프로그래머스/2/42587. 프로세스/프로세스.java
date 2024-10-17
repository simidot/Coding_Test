import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : priorities) {
            pQueue.offer(i);
        }

        while (!pQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pQueue.peek() == priorities[i]) {
                    pQueue.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }

            }
        }

        
        return answer;
    }
}