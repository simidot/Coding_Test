import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//스택 실버4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        Stack<Integer> stack = new Stack<>();


        for(int i=0; i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "top":
                    if(stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
        //명령 처리 프로그램
        // push X : 스택에 X 넣기
        // pop : 스택에서 pop, 없는 경우 -1
        // size : 스택에 들어있는 정수의 개수 출력

    }
}
