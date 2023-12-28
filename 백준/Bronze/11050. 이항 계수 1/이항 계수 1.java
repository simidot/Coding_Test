import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이항계수1 브론즈1
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] dp = new int[11][11];
        for(int i=0; i<dp.length; i++) {
            dp[i][0] = 1; //r==0
            dp[i][i] = 1; //n==r
        }
        for(int i=1; i<11; i++) {
            for(int j=1; j<11; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[N][K]);
    }
}
