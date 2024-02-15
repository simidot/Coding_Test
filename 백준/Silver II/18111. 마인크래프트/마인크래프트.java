import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//마인크래프트 실버2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int max = 0;
        int min = 256;
        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(map[i][j], max);
                min = Math.min(map[i][j], min);
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;

        for (int i = max; i >= min; i--) {
            int seconds = 0; 
            int inventory = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] > i) {
                        inventory += (map[j][k] - i);
                        seconds += (map[j][k]-i)*2;
                    }
                    else if (map[j][k] < i) {
                        inventory -= (i - map[j][k]);
                        seconds += (i - map[j][k]);
                    }
                }
            }
            if (inventory >= 0 && time > seconds) {
                height = i;
                time = seconds;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(time).append(" ").append(height);
        System.out.println(sb);

    }
}
