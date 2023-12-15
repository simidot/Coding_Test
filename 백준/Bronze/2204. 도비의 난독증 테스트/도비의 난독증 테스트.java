import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//도비의 난독증 테스트 브론즈1
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str=br.readLine()).equals("0")) {
            int n = Integer.parseInt(str);

            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = br.readLine();
            }

            Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
            System.out.println(words[0]);
        }
    }
}

