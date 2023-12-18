import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//검증수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int sum = 0;
        // 고유번호의 처음 5자리 숫자들
        for (int i=0; i<inputs.length; i++) {
            int x = Integer.parseInt(inputs[i]);
            sum += x*x; //제곱한 수들을 더함.
        }
        // 검증 수 = 고유번호 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지
        System.out.println(sum%10);
        // 검증 수를 출력
    }
}
