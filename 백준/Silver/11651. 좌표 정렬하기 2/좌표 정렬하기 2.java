import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//좌표 정렬하기2 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] array = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            array[i][1] = Integer.parseInt(st[0]);
            array[i][0] = Integer.parseInt(st[1]);
        }
        Arrays.sort(array, (e1, e2)->{
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(array[i][1]).append(" ").append(array[i][0]).append("\n");
        }
        System.out.println(sb);
    }
}
