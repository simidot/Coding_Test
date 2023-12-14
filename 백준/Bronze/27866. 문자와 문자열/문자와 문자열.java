import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자와 문자열
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int num = Integer.parseInt(br.readLine());

        System.out.println(input[num-1]);
    }
}
