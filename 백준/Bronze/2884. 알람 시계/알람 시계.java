import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알람시계 브론즈3
public class Main {
    public static void main(String[] args) throws IOException {
        //45분 일찍 알람 설정하기.
        // 두정수 H시 M분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int H = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);


        if (M < 45) {
            if (H==0) {
                H = 23;
            } else {
                H -= 1;
            }
            M = M+60-45;
        } else {
            M -= 45;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(H+" "+M);
        System.out.println(sb);
    }
}
