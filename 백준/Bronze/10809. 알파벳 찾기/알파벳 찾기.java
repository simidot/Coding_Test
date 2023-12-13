import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


//알파벳 찾기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        int[] answer = new int[26];

        for(int i=0; i<answer.length; i++) {
            answer[i] = -1;
        }

        for(int i=chars.length-1; i>=0; i--) {
            answer[chars[i]-'a'] = i;
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<answer.length; i++) {
            sb.append(answer[i]+" ");
        }
        System.out.println(sb);
    }
}
