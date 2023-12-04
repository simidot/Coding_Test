import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX 퀴즈
public class Main {
    public static void main(String[] args) throws IOException {
        // 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());
        String[] inputs = new String[cases];

        for (int i=0; i<cases; i++) {
            inputs[i] = br.readLine();
        }
        
        for (int i=0; i<cases; i++) {
            int plusScore = 0; // 얼마나 더할지
            int sum = 0; // 전체 합산
            for(int j=0; j<inputs[i].length(); j++) {
                char ox = inputs[i].charAt(j);

                if (ox=='O') {
                    plusScore++;
                    sum += plusScore;
                } else {
                    plusScore = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
