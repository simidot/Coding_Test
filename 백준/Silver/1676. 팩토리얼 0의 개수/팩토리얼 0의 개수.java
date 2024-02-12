import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//팩토리얼 0의 개수 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        // N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지
        // 0의 개수를 구하여 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count=0;

        while (N >= 5) {
            count += N/5;
            N /= 5;
        }
        System.out.println(count);
    }
}
