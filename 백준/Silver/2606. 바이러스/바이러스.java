import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 바이러스
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 컴퓨터의 수 입력받기
        int computers = Integer.parseInt(br.readLine());

        // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수 = map을 만들기 위한 연결 정보의 개수
        int connects = Integer.parseInt(br.readLine());

        // 연결정보를 가지고 채워넣은 map (연결되어 있다면 1이다)
        // computers+1을 하는 이유는 [0][], [][0]은 빈 공간이기 때문이다.
        int[][] map = new int[computers+1][computers+1];

        // 주어진 연결 정보 개수만큼 (connects) 반복하며 map을 만든다.
        for (int i=0; i<connects; i++) {
            // 입력 받은 값을 공백을 기준으로 나누고
            String[] edgeInfo = br.readLine().split(" ");

            // 변수에 할당.
            int leftNode = Integer.parseInt(edgeInfo[0]);
            int rightNode = Integer.parseInt(edgeInfo[1]);

            // 연결점의 map에 1을 할당 (서로 연결되어 있으므로 양쪽 다 할당한다)
            map[leftNode][rightNode] = 1;
            map[rightNode][leftNode] = 1;
        }

        // 다음 바이러스에 걸리는 컴퓨터를 기록하기 위한 스택
        Stack<Integer> tobeInfected = new Stack<>();
        // 몇개의 컴퓨터가 감염되었는지 셀 수 있는 변수. (pop한 점을 카운트)
        int count = -1;
        // 이미 감염되었는지 확인하기 위한 boolean 배열
        boolean[] infected = new boolean[computers+1];

        //DFS 시작
        // 1번 컴퓨터가 바이러스에 걸렸다.
        tobeInfected.push(1);

        // 이후 연결된 모든 컴퓨터에 바이러스에 걸리므로 더이상 컴퓨터가 없을때까지 반복
        // = 스택이 빌 때까지
        while(!tobeInfected.empty()) {
            // 감염되면서 pop. > 그리고 그 감염된 컴퓨터와 연결된 컴퓨터들을 push해야 하므로. 변수에 저장한다.
            int next = tobeInfected.pop();

            if (!infected[next]) {
                // pop하면서 감염되었다는 표시
                infected[next] = true;
                // 감염된 컴퓨터 추가
                count++;
            }

            // 다음 바이러스 감염 가능성이 있는 컴퓨터를 스택에 push
            for (int i=1; i<=computers; i++) {
                // 만약 이미 감염되었으면 추가X
                if (infected[i]) continue;
                if (map[next][i]==1) { // 만약 next와 연결된 컴퓨터가 있다면 스택에 push
                    tobeInfected.push(i);
                }
            }
        }

        System.out.println(count);
    }
}
