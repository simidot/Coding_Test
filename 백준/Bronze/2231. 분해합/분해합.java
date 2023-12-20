import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//분해합 브론즈2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 0;

        // 입력 받은 정수에서 자릿수길이만큼 9를 빼준다.
        //그보다 작다면? 생성자가 될 수 없다!!
        // 탐색을 거기부터 시작하면 된다.
        
        // 자릿수길이 알기 위해 
        int N_length =input.length();
        int N = Integer.parseInt(input);
        
        for(int i=N-(9*N_length); i<N; i++) {
            int M=i;
            int sum = 0;
            while(M%10!=0) {
                sum +=(M%10); //각 자릿수 더하기
                M /= 10; // 더한 후 10으로 나누어 마지막자리 제거
            }

            if(sum +i == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}

