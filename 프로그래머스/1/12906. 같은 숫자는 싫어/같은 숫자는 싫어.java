import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
        }
        
        answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}