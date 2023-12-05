import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
                int[] answer = {};

        // 배열을 돌며 첫번째 2와 마지막 2를 찾아 인덱스값 찾고
        // 첫번째 2와 마지막 2가 같으면 그냥 2 반환
        // 2가 없으면 -1 반환
        // 둘다 있으면 start index부터 last index까지 모두 반환.

        List<Integer> arrList = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            arrList.add(arr[i]);
        }

        int start = arrList.indexOf(2);
        int last = arrList.lastIndexOf(2);


        List<Integer> answerList = new ArrayList<>();

        if (start== -1) {
            answerList.add(-1);
        } else if (start == last) {
            answerList.add(2);
        } else {
            for(int i=start; i<=last; i++) {
                answerList.add(arr[i]);
            }
        }

        answer = answerList.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}