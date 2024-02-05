import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Hasing 브론즈2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] inputs = br.readLine().toCharArray();
        int[] ints = new int[L];
        for (int i = 0; i < L; i++) {
            ints[i] = inputs[i]-96;
        }

        int result = 0;
        for (int i = 0; i < L; i++) {
            result += ints[i] * Math.pow(31, i);
        }
        System.out.println(result);
    }
}
