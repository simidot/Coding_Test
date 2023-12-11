import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        answer = Arrays.stream(array).sorted().toArray()[array.length/2];
        return answer;
    }
}