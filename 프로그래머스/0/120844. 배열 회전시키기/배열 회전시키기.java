import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        Deque<Integer> deque = new LinkedList<>();
        // 배열 numbers의 원소를 direction 방향으로 한 칸씩 회전시킨 배열을 return.
        for (int i = 0; i < numbers.length; i++) {
            deque.add(numbers[i]);
        }
        if (direction.equals("right")) { //맨 뒤의 원소를 꺼내 맨 앞으로
            deque.offerFirst(deque.pollLast());
        } else {
            deque.offerLast(deque.pollFirst());
        }
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = deque.pollFirst();
        }
        return answer;
    }
}