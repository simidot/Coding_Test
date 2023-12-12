import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// DFS와 BFS
public class Main {
    public static int[][] map;
    public static int N;
    public static int V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄 정점의 개수 N, 간선의 개수 M, 탐색 시작할 번호 V
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]); //방문지점 개수
        int M = Integer.parseInt(inputs[1]); //연결다리 개수
        V = Integer.parseInt(inputs[2]); // 시작번호

        map = new int[N + 1][N + 1]; //방문지점과 각 지점의 연결성을 표시하는 맵

        // 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호.
        for (int i = 0; i < M; i++) {
            String[] connects = br.readLine().split(" ");

            int left = Integer.parseInt(connects[0]);
            int right = Integer.parseInt(connects[1]);

            map[left][right] = 1;
            map[right][left] = 1;
        } // 맵 완성


        System.out.println(dfs());
        System.out.println(bfs());

    }

    public static String dfs() {
        // 첫째줄에는 DFS 결과
        // 1. Stack
        // 2. List 방문한 곳 저장
        // 3. 방문 여부 저장 boolean
        Stack<Integer> toVisit = new Stack<>();
        List<Integer> visitOrder = new ArrayList<>();
        boolean[] visited = new boolean[N+1];

        toVisit.push(V); //첫 시작이니 스택에 넣고 시작

        while (!toVisit.empty()) {
            int num = toVisit.pop(); // 꺼낸 것이 확인할 num

            if (visited[num]) continue;

            visitOrder.add(num);
            visited[num] = true;

            for (int i = N; i > 0; i--) {
                if(visited[i]) continue;
                if (map[num][i] == 1) {
                    toVisit.push(i);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i:visitOrder){
            sb.append(i+" ");
        }
        return sb.toString();
    }


    public static String bfs() {
        // 둘째줄에는 BFS 결과
        Queue<Integer> toVisit2 = new LinkedList<>();
        List<Integer> visitOrder2 = new ArrayList<>();
        boolean[] visited = new boolean[N+1];


        toVisit2.offer(V);

        while(!toVisit2.isEmpty()) {
            int num2 = toVisit2.poll();

            if(visited[num2]==true) continue;

            visitOrder2.add(num2);
            visited[num2] = true;

            for(int i=1; i<N+1; i++) {
                if(visited[i]) continue;
                if(map[num2][i]==1) {
                    toVisit2.offer(i);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i:visitOrder2){
            sb.append(i+" ");
        }
        return sb.toString();
    }
}
