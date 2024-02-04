import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택 수열 실버2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > num) {
                for (int i = num + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                num = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
