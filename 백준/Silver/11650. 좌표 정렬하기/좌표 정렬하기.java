import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 좌표 정렬하기 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 2차원 평면 위에 점 N개
        // 점의 갯수 N
        // N개의 줄에 i번점의 위치 xi, yi가 주어진다...!
        int[][] map = new int[N][2];

        for(int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");

            map[i][0] = Integer.parseInt(inputs[0]);
            map[i][1] = Integer.parseInt(inputs[1]);
        }

        Arrays.sort(map, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<map.length; i++) {
            sb.append(map[i][0]+" "+map[i][1]+"\n");
        }

        // 출력 : 점을 정렬한 결과를 출력
        System.out.println(sb);
    }
}
