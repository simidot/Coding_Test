import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            char[] inputChar = br.readLine().toCharArray();
            int length = inputChar.length;
            if (inputChar[0] == '0') break;
            boolean answer = true;

            // 앞에서부터 반, 뒤에서부터 반 가져와서 비교
            for (int i = 0; i < length/2; i++) {
                if (inputChar[length-i-1] != inputChar[i]) {
                    answer = false;
                }
            }

            if (answer) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
}