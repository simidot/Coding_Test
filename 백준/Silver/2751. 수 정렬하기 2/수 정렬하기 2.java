import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수 정렬하기 2 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        // N개의 수가 주어졌을 때 오름차순으로 정렬하는 프로그램.
        // 첫째줄 수의 개수 N
        // 나머지 수 주어짐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        int[] array = new int[N];
        for(int i=0; i<N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for(int i : array) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
