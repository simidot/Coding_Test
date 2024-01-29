import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//듣보잡
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrays = br.readLine().split(" ");
        int N = Integer.parseInt(arrays[0]);
        int M = Integer.parseInt(arrays[1]);

        HashSet<String> notHeard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            notHeard.add(br.readLine());
        }

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String notSeen = br.readLine();
            if (notHeard.contains(notSeen)) {
                answer.add(notSeen);
            }
        }

        answer.sort(String::compareTo);
        StringBuffer sb = new StringBuffer();
        sb.append(answer.size()).append("\n");
        for (String s : answer) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
