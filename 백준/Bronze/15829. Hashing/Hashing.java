import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Hasing 브론즈2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        String s = br.readLine();
        int M = 1234567891;
        long r = 1;

        long sum = 0;
        for (int i = 0; i < L; i++) {
            sum += (s.charAt(i)-96)*r;
            r = (r*31) % M;
        }
        System.out.println(sum % M);
    }
}
