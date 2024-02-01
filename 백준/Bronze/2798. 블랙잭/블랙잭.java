import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//블랙잭 브론즈2
public class Main {
    public static int sum;
    public static int max;

    public static void main(String[] args) throws IOException {
        //1. 카드의 개수 N개, 딜러가 외치는 숫자 M
        //2. N개 카드에 쓰여있는 수
        // = M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrays = br.readLine().split(" ");
        int N = Integer.parseInt(arrays[0]);
        int M = Integer.parseInt(arrays[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArray = new int[N];
        for (int i = 0; i < N; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        max = 0;
        // N C 3이 <= M 인걸 찾아야 한다.
        combArray(intArray, 3, 0, 0, new int[3], M);
        System.out.println(max);

    }

    public static void combArray(int[] intArray, int r, int k, int next, int[] comb, int M) {
        sum=0;
        if (k == r) {
            for (int i : comb) {
                sum +=i;
            }
            if (sum <= M) {
                if (sum > max)
                max = sum;
            }
        } else if (next == intArray.length) {
            return;
        } else {
            comb[k] = intArray[next];
            combArray(intArray, r, k+1, next + 1, comb, M);
            combArray(intArray, r, k, next+1, comb, M);
        }
    }
}
