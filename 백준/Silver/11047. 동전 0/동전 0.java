import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//동전 0 실버4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[coins.length - i-1] = Integer.parseInt(br.readLine());
        }

        int count=0;
        while (K!=0) {
            for (int i = 0; i < coins.length; i++) {
                if (coins[i] <= K) {
                    count += K / coins[i];
                    K -= K/coins[i] * coins[i];
                }
            }
        }
        System.out.println(count);
    }
}
