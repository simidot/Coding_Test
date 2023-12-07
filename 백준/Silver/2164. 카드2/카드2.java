import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 카드 2
public class Main {
    public static void main(String[] args) throws IOException {
        // 제일 위에 있는 카드를 바닥에 버린다 (poll)
        // 제일 위 카드를 제일 아래에 있는 카드 밑으로 옮긴다. (offer)
        // 반복
        // 제일 마지막에 남게 되는 카드를 구한다. (큐의 크기가 1이 될때까지)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        Queue myQueue = new LinkedList();

        for (int i=1; i<=input; i++) {
            myQueue.add(i);
        }

        while(myQueue.size()>1) {
            myQueue.poll();
            myQueue.offer(myQueue.poll());
        }

        System.out.println(myQueue.poll());
    }
}