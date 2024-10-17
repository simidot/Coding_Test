import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int i : scoville) {
            pQueue.offer(i);
        }

        while (pQueue.peek() < K) {
            if (pQueue.size() < 2) {
                return -1;
            }
            int first = pQueue.poll();
            int second = pQueue.poll();
            int combined = first + (second * 2);
            pQueue.offer(combined);
            answer++;
        }
        return answer;
    }
}