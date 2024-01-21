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
        // 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(<=N)
        // 순서대로 K번째 사람을 제거한다... > N명의 사람이 제거될때까지 계속.
        // 제거되는 순서를 요세푸스 순열.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 큐를 활용한다.
        // 1,2번째는 뽑고poll 맨뒤로 옮기고offer, 3번째는 뽑기만하기.
        Queue<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        sb.append("<");

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for(int i=1; i<=N; i++) {
                if (i == K) {
                    sb.append(queue.poll()).append(", ");
                    break;
                } else {
                    queue.offer(queue.poll());
                }
            }
        }

        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}
