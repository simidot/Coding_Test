import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// DFS와 BFS
public class Main {
    static int N;
    static int M;
    static int V;
    static StringBuffer sb;
    static boolean[] visited;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        V= Integer.parseInt(st.nextToken());

        map = new int[N+1][N+1];
        visited = new boolean[N+1]; //visited 초기화
        sb = new StringBuffer();

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            map[left][right]=1;
            map[right][left]=1;
        }

        dfs(V);
        System.out.println(sb);
        visited = new boolean[N+1]; //visited 초기화
        sb.delete(0, sb.length()); //stringBuffer 초기화
        bfs(V);
        System.out.println(sb);

    }

    public static void dfs(int V){
        visited[V]=true; //들어온 순간 true가 됨.
        sb.append(V+" "); //그 값을 sb에 덧붙임

        for(int i=1; i<=N; i++) { //V와 연결된 것을 찾는다
            if(map[V][i]==1&&!visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int V){
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.offer(V);

        while(!myQueue.isEmpty()){
            int next = myQueue.poll();

            if(visited[next]) continue;
            sb.append(next+" ");
            visited[next] = true;

            for(int i=1; i<=N; i++) {
                if(visited[i]) continue;
                if (map[next][i] == 1) {
                    myQueue.offer(i);
                }
            }
        }
    }
}
