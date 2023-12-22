import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사파리월드
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2개의 서브도메인이 잇는데
        // 합쳐진다...
        // 유명도가 너무 차이나지 않을 겨우에만...
        // 유명도는 정수이다.
        String[] inputs = br.readLine().split(" ");


        Long N = Long.parseLong(inputs[0]);
        Long M = Long.parseLong(inputs[1]);

        if (N-M >=0) {
            System.out.println(N - M);
        } else {
            System.out.println(M - N);
        }
    }
}
