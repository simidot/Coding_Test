import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//다리 놓기 실버5
public class Main {
    private static final int[][] dp = new int[31][31];

    public static void main(String[] args) throws IOException {
        //테스트 케이스의 수 T
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        // 각각의 테스트케이스에 대해 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            // N개만큼 다리를 지으려고 할 때 다리를 지을 수 있는 경우의 수를 구한다.
            // mPn
            sb.append(combination(M, N)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    public static int combination(int n, int r){
        //이미 계산된 값일 경우
        if (dp[n][r]>0) {
            return dp[n][r];
        }
        else if(n==r||r==0) { //원소의 개수가 조합의 갯수와 동일하거나 0일 경우
            return dp[n][r] =1;
        } else {
            return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }
}
