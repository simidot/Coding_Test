import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//소수 브론즈2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        br.close();

        int sum = 0;
        int min = N;
        boolean[] primeCheck = new boolean[N + 1];
        primeCheck[1]=true;

        for (int i = 2; i * i <= N; i++) {
            if (primeCheck[i]) continue; // 이미 체크된 배열일 경우 skip
                // 조건문 내에서는 j가 2부터
                for (int j = i * i; j < primeCheck.length; j += i) {
                    primeCheck[j] = true;
                }
        }

        for (int i = M; i <= N; i++) {
            if (primeCheck[i]==false) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
