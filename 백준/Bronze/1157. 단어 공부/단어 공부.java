import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//단어 공부 브론즈1
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toUpperCase().toCharArray();

        int[] count = new int[26];
        // 가장 많이 사용된 알파벳을 대문자로 출력.
        // 아스키코드로 표현하면 A는 65 Z는 90
        for(int i=0; i<input.length; i++) {
            count[input[i]-65]++;
        }
        // 여러개면 ? 출력
        int max = count[0];
        char answer = 'A';
        for(int i=1; i<count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                answer = (char)(i+65);
            } else if (count[i]==max) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
