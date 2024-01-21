import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;

        // 동그랗게 서서 공 던지기 게임
        // 1번부터 던지고 오른쪽으로 한 명 건너뛰고 그 다음 사람에게만 던질 수 있다.
        // k번째로 공을 던지는 사람의 번호를 반환.
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++) {
            queue.offer(numbers[i]);
        }

        for (int j = 0; j <k-1; j++) {
            for (int i = 1; i <= numbers.length; i++) {

                if (i == 3) {
                    answer = queue.peek();
                    break;
                } else {
                    queue.offer(queue.poll());
                }
            }
        }


        return answer;
    }
}