import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수 정렬하기3 브론즈1
public class Main {
    public static void main(String[] args) throws IOException {
        //N개의 수가 주어졌을 떄 이를 오름차순으로 정렬하는 프로그램.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arrays = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrays[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrays);
        StringBuffer sb = new StringBuffer();
        for (int i : arrays) {
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}
