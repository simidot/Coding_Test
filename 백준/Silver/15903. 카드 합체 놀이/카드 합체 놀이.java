import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 카드 합체 놀이 실버1
public class Main {
    public static void main(String[] args) throws IOException {
        // 만들 수 있는 가장 작은 점수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. 카드의 개수n, 카드합체 횟수 m
        //2. 맨 처음 카드의 상태를 나타내는 n개의 자연수가 주어짐
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        PriorityQueue<Long> pqueue = new PriorityQueue<>();
        String[] nums = br.readLine().split(" ");
        // 가장 작은 두개의 카드를 골라서 합쳐야 총 합을 최대한 작게 유지할 수 있다.
        for (int i = 0; i < n; i++) {
            pqueue.offer(Long.parseLong(nums[i]));
        }
        for (int i = 0; i < m; i++) {
            Long first = pqueue.poll();
            Long second = pqueue.poll();
            pqueue.offer(first + second);
            pqueue.offer(first + second);
        }
        Long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum += pqueue.poll();
        }
        System.out.println(sum);
    }
}
