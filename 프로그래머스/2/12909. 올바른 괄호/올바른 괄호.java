import java.util.Stack;

class Solution {
    boolean solution(String s) {
       boolean answer = true;

        Stack<Character> myStack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char next = s.charAt(i);

            if (next == '(') {
                myStack.push(next);
            }
            else {
                if(myStack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    myStack.pop();
                }
            }

        }

        if (!myStack.isEmpty()) answer = false;

        return answer;
    }
}