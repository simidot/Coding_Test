import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        if (s.startsWith(")")) answer = false;

        // String을 char로 만들어 확인작업 > 오픈하면 스택에 넣기
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c=='(') {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    stack.pop();
                }
            }
        }
        if (stack.size()>0) {
            answer = false;
        }
        
        return answer;

        }
}