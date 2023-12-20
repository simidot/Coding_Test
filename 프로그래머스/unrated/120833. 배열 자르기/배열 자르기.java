import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        List<Integer> array = new ArrayList<>();
        //정수배열의 num1번째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 출력
        for(int i=num1; i<=num2; i++) {
            array.add(numbers[i]);
        }

        for(int i=0; i<array.size(); i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}