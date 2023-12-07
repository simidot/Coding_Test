import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 요세푸스 문제 실버4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        // 1~N까지 N명의 사람이 원을 이룸. > 사실 큐...라는 뜻..?
        Queue<Integer> people = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            people.offer(i);
        }
        // 제거 후 남은 사람들로 이루어진 원을 따라 계속 반복 (모두 제거될 때까지)
        // 제거되는 순서를 요세푸스 순열.
        sb.append("<");
        while(people.size()>1) {
            for (int i=0; i<K-1; i++) {
                int value = people.poll();
                people.offer(value);
            }
            sb.append(people.poll()).append(", ");
        }
        sb.append(people.poll());
        sb.append(">");
        System.out.println(sb);
    }
}
