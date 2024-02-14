import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 구하기 실버3
public class Main {
    public static void main(String[] args) throws IOException {
        // M이상 N이하의 소수를 모두 출력하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] primeCheck = new boolean[N + 1];
        for (int i = 2; i < primeCheck.length; i++) {
            primeCheck[i]=true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i*i <= N; i++) {
            if (primeCheck[i]) {
                for (int j = i * 2; j <= N; j += i) {
                    primeCheck[j] = false;
                }
            }
        }
        for (int i = M; i <= N; i++) {
            if (primeCheck[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
