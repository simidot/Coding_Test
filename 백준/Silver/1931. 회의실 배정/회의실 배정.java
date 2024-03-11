import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 회의실 배정 실버 1
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //회의의 수
        int N = Integer.parseInt(br.readLine());
        // 회의시작 - 끝나는 시간
        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            meetings[i][0] = Integer.parseInt(inputs[0]); //시작시간
            meetings[i][1] = Integer.parseInt(inputs[1]); //종료시간
        }

        // 종료시간을 기준으로 오름차순 정렬
        Arrays.sort(meetings, (o1, o2) -> {
            //o1, o2는 meeting[i]와 meeting[j]를 나타냄
            if (o1[1] != o2[1]) return o1[1]-o2[1]; //종료시간 기준 정렬
            return o1[0]-o2[0]; //종료시간 같을 경우 시작시간 빠른 순으로 정렬
        });

        //얼마나 많은 회의를 진행할 수 있는지
        int answer = 0;
        // 현재 가장 빨리 끝나는 회의의 시간을 기록하기 위한 변수
        // 하나의 회의를 고르면 해당 회의의 종료시간으로 갱신된다.
        int lastEnd = 0;
        for (int i = 0; i < N; i++) {
            // 이번 회의의 시작시간이 이전 회의의 끝 시간보다 늦거나 같으면
            if (meetings[i][0] >= lastEnd) {
                // 진행가능한 회의가 하나 늘고
                answer++;
                //다음 회의가 끝나는 시간을 기록한다.
                lastEnd = meetings[i][1];

            }
        }
        System.out.println(answer);
    }
}
