import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 하노이 탑 이동 순서 골드5
public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 1. 첫번째 장대에 쌓인 원판의 개수 N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 출력 1. 옮긴 횟수 K
        sb.append((int) (Math.pow(2, N) - 1)).append("\n");

        // 2. 수행 과정 출력 가장 위의 원판을 어디로 옮기는지
        hanoiTop(N, 1, 3, 2);
        System.out.println(sb);
    }

    public static void hanoiTop(
            //하노이의 탑의 높이
            int height,
            // 현재 출발하고자 하는 기둥
            int start,
            // 목표로 하는 기둥
            int end,
            // 제3의 기둥
            int other
    ) {
        // 높이가 1이라면 start -> end로 이동시킨다.
        if (height == 1) {
            sb.append(start).append(" ").append(end).append("\n");
        }
        // 높이가 2이상이면 ?
        else {
            // 1. 한단계 아래 높이의 원반들을 other로 이동
            hanoiTop(height - 1, start, other, end);
            // 2. 제일 아래 원반을 end로 이동
            sb.append(start).append(" ").append(end).append("\n");
            // 3. other에 이동된 한단계 아래 높이의 원반들을 end로 이동.
            hanoiTop(height-1, other, end, start);
        }
    }
}
