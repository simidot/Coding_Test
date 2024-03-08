import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// N번째 큰 수 실버2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. N : NxN의 표
        // 2. 다음 각 줄마다 N개의 수
        // 3. N번째 큰 수를 출력
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                pqueue.offer(Integer.parseInt(st.nextToken()));
                if (pqueue.size() > N) {
                    //하나 빼서 n개로 유지한다.
                    pqueue.poll();
                }
            }
        }
        System.out.println(pqueue.poll());
    }
}
