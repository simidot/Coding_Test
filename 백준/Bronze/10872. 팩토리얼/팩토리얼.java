import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼 브론즈5
public class Main {
    private static int[] dp = new int[13];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }

    public static int factorial(int n) { //3
        if (n==1| n==0) {
            dp[n] = 1;
        } else {
            dp[n] = n*factorial(n-1);
        }
        return dp[n];
    }
}
