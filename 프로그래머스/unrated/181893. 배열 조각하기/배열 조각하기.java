import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = new int[arr.length];

        for (int i=0; i<query.length; i++) {
            if (i%2==0) { // 짝수 인덱스에서는 arr에서 query[i]번 인덱스 뒷부분 제거
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {// 홀수 인덱스에서는 arr에서 query[i]번 인덱스 앞부분 제거
                arr =Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }

        answer = arr;
        return answer;
    }
}