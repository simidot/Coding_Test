import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(br.readLine());
        String[] inputs = new String[lines];

        for (int i=0; i<lines;i++) {
            inputs[i] = br.readLine();
        }

        for(String s:inputs) {
            if(isVPS(s)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }

    }

    // 괄호를 검사하는 메서드를 만들자.
    public static boolean isVPS(String line) {
        // 각 글자 중 열린 괄호를 담을 스택을 만든다.
        Stack<Character> myStack = new Stack<>();

        // 입력받은 문자열의 각 글자를 순회한다.
        for(int i=0; i<line.length(); i++) {
            char next = line.charAt(i);
            // 만약 글자가 열린 괄호라면 스택에 푸시

            // 아니라면 닫힌 괄호이다.
            // 스택이 비었다면 false반환
            // 비어있지 않으면 pop
            if (next == '(') {
                myStack.push(next);
            } else {
                if (myStack.isEmpty()) return false;
                else myStack.pop();
            }
        }
        // 순회 종료
        // 스택이 비었는지 확인하고 반환한다.
        if(myStack.isEmpty()) return true;
        else return false;
    }
}