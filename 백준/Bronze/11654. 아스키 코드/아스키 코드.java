import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 아스키코드
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] charInput = input.toCharArray();

        System.out.println(charInput[0]+0);
    }
}
