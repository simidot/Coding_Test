import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//숫자의 합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum=0;
        String[] inputs = br.readLine().split("");

        for(int i=0; i<N; i++) {
            sum+=Integer.parseInt(inputs[i]);
        }
        System.out.println(sum);
    }
}
