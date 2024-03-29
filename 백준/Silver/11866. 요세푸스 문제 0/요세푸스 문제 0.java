import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//요세푸스 문제 0 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        sb.append("<");

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size()>1) {
            for(int i=1; i<=N; i++) {
                if (i == K) {
                    sb.append(queue.poll()).append(", ");
                    break;
                } else {
                    queue.offer(queue.poll());
                }
            }
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
