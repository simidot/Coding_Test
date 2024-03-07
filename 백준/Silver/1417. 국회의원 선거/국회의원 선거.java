import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// 국회의원 선거
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int candidates = Integer.parseInt(br.readLine());
        int myVote = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> otherVotes = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < candidates - 1; i++) {
            otherVotes.add(Integer.parseInt(br.readLine()));
        }

        int answer = 0;

        if (!otherVotes.isEmpty()) {
            while (otherVotes.peek() >= myVote) {
                int maxVotes = otherVotes.poll();
                otherVotes.offer(maxVotes - 1);
                myVote++;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
