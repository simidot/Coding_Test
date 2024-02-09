import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//프린터 큐
// 실버3
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>(); //Queue로 활용할 연결리스트
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                //{초기위치, 중요도}
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0; //출력 횟수
            while (!q.isEmpty()) { //한 케이스에 대한 반복문
                int[] front = q.poll(); //가장 첫 원소
                boolean isMax = true; //front원소가 가장 큰 원소인지를 판단

                //큐에 남아있는 원소들과 중요도를 비교
                for (int i = 0; i < q.size(); i++) {
                    if (front[1] < q.get(i)[1]) {
                        q.offer(front);
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }
                        isMax = false;
                        break;
                        //front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
                    }
                }
                //front 원소가 가장 큰 원소가 아니었으므로 다음 반복문으로 넘어감
                if (isMax == false) {
                    continue;
                }
                //front원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서.
                count++;
                if (front[0] == M) {
                    break;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
