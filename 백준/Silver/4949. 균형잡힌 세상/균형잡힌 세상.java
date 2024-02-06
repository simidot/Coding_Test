import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 균형잡힌 세상 실버4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        while (!(s = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for (int i = 0; i < s.length()-1; i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else if (c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()||!(stack.peek().equals('('))) {
                        check = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty()||!(stack.peek().equals('['))) {
                        check = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else {
                    continue;
                }
            }
            if (stack.isEmpty() && check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
