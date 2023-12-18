import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACM 호텔 브론즈3
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 데이터
        // T개의 테스트 데이터
        // 각 테스트 데이터는 한 행으로
        // H 호텔의 층수, W 각 층의 방수, N 몇번째 손님인지

        // 출력 : N번째 손님에게 배정되어야 하는 방 번호를 출력.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i=0; i<input; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); //층수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방수
            int N = Integer.parseInt(st.nextToken()); // 몇번째 손님인지

            // WxH사이즈의 호텔
            // N/H N%H
            if (N%H==0) {
                System.out.println((H*100+(N/H)));
            } else {
            System.out.println(((N%H)*100)+((N/H)+1));
            }
        }
    }
}
