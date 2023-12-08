import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 덩치 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 사람의 수
        int N = Integer.parseInt(br.readLine());

        // 2차원 배열로 표현 (왼쪽에 몸무게, 오른쪽에 키)
        int[][] info = new int[N][2];

        // 각 사람의 몸무게와 키를 나타낸다.
        for (int i=0; i<N; i++) {
            String[] infos = br.readLine().split(" ");

            info[i][0] = Integer.parseInt(infos[0]); //몸무게 정보 입력
            info[i][1] = Integer.parseInt(infos[1]); // 키 정보 입력
        }

        // 덩치는 (x,y)로 표현 (x>p && y>p) 더크다고 표현가능
        for (int i=0; i<N; i++) { // 각 사람마다 나머지 사람들과 비교해서 덩치가 크면 count 플러스
            int count =0; // 크면 바로 count할 것.
            for (int j=0; j<N; j++) {
                if (info[j][0] > info[i][0] && info[j][1] > info[i][1]) {
                    count++;
                }
            }
            // 덩치등수는 자신보다 더 큰 덩치의 사람의 수. (없으면 1등인 것) k+1
            System.out.println(count+1);
        }
    }
}
