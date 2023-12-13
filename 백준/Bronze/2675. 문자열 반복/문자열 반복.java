import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자열 반복
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            String[] inputs = br.readLine().split(" ");
            //문자열 S입력
            // 반복횟수 R
            int R = Integer.parseInt(inputs[0]); //각 글자 반복 횟수
            char[] S = inputs[1].toCharArray();

            StringBuffer sb = new StringBuffer();
            // 새 문자열 P 출력
            for(int j=0; j<S.length; j++) {
                for(int k=0; k<R; k++) {
                    sb.append(S[j]);
                }
            }
            System.out.println(sb);
        }
    }
}
