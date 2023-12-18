import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 개수 브론즈2
public class Main {
    public static void main(String[] args) throws IOException {
        // 세개의 자연수 a,b,c
        // a*b*c 결과에 0부터 9까지 각각의 숫자아 몇 번씩 쓰였는지 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();
        
        String result = String.valueOf(A*B*C);
        int[] count = new int[10];

        for (int i=0; i<result.length(); i++) {
            count[(result.charAt(i)-48)]++;
        }

        for (int num: count) {
            System.out.println(num);
        }
    }
}
