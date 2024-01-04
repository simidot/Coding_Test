import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치 수 2 브론즈2
public class Main {
    private static long[] fiboMemo;
    public static void main(String[] args) throws IOException {
        //피보나치 수는 0과 1로 시작한다.
        // F0 = 0, F1 = 1
        // Fn = Fn-1 + Fn-2
        // n번째 피보나치 수를 구하는 프로그램 작성

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fiboMemo = new long[n+1];

        System.out.println(fibo(n));
    }

    public static long fibo(int n) {
        if(fiboMemo[n] !=0) {
            return fiboMemo[n];
        } else if(n<2) {
            fiboMemo[n] = n;
        } else {
            fiboMemo[n] = fibo(n-1)+fibo(n-2);
        }
        return fiboMemo[n];
    }
}
