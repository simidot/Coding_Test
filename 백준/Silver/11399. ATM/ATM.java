import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 정렬
// ATM 실버 4
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 범위는 1~1000이므로 1001개의 index
        int[] arr = new int[1001];

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        br.close();
        // int[] arr = {0, 1, 1, 2, 1, ...}

        int prev = 0;
        int sum = 0;

        // counting sort
        for (int i = 0; i < 1001; i++) {
            while (arr[i] != 0) {
                sum += (i + prev);
                prev +=i;
                arr[i]--;
            }
        }
        System.out.println(sum);
    }
}
