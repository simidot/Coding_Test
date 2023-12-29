import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이항계수1 브론즈1
public class Main {
    private static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];
        System.out.println((BC(N,K)));
    }
    public static int BC(int n, int k) {
        if (dp[n][k]>0) {
            return dp[n][k];
        }
        if (k==0|n==k) {
            return dp[n][k] = 1;
        } else {
            return dp[n][k] = (BC(n - 1, k - 1) + BC(n - 1, k))%10007;
        }
    }
}
