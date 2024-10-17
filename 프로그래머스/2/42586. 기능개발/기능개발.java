import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        // progresses = 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열
        // speeds = 작업의 개발 속도가 적힌 정수 배열
        // 각 배포마다 몇 개의 기능이 배포되는지를 리턴
        // 배포는 하루에 한 번만 하루의 끝에.
        // 뒤 기능이 완료되어도 앞 기능이 배포되지 않으면 배포 불가
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int work = 100 - progresses[i]; // 100퍼센트에서 현재 작업률 빼서 남은 작업 확인

            if (work % speeds[i] == 0) { // 남은 작업이 딱 떨어지면 그 일수를 넣고
                queue.add(work / speeds[i]);
            } else { // 딱 떨어지지 않으면 하루를 더 넣는다
                queue.add(work / speeds[i] + 1);
            }
        }

        while (!queue.isEmpty()) {
            int count = 1;
            int day = queue.poll();

            while (!queue.isEmpty() && day >= queue.peek()) { // 현재 작업과 다음 작업을 비교하여 다음 작업도 같이 끝난거면 넣어주기
                count++;
                queue.poll();
            }
            list.add(count);
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}