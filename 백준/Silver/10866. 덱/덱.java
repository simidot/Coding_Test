import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 덱 실버4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push_front":
                    int x = Integer.parseInt(st.nextToken());
                    deque.offerFirst(x);
                    break;
                case "push_back":
                    int y = Integer.parseInt(st.nextToken());
                    deque.offerLast(y);
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? "-1" : deque.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? "-1" : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);

    }
}
