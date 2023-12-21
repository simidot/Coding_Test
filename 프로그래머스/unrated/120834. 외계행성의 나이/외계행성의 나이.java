import java.util.Stack;

class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        Stack<Integer> ages = new Stack<>();
        while(age!=0) {
            ages.push(age % 10);
            age /=10;
        }

        while(!ages.isEmpty()) {
            char charPop = Integer.toString(ages.pop()).charAt(0);
            sb.append((char)(charPop+49));
        }

        answer = sb.toString();
        return answer;
    }
}