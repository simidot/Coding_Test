import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//다리 놓기 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        int[][] dp = new int[30][30];

        for(int i=1; i<30; i++) { // n==r일 때와 r==0일때 1로 설정
            dp[i][i] = 1; //n==r
            dp[i][0] = 1; //r==0
        }

        // 그 외에는 nCr = n-1Cr-1 + n-1Cr 규칙 사용하여 계산
        for(int i=2; i<30; i++) {
            for(int j=1; j<30; j++) {
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(dp[M][N]).append("\n");
        }
        System.out.println(sb);
    }
}