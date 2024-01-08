import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//체스판 다시 칠하기 실버4
public class Main {
    // 입력 값 정리 boolean 맵
    public static boolean[][] map;
    // 최솟값을 모두 바꾸는 8x8 64로 설정 후 비교하며 바꾸기.
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        // MxN크기의 보드를 8x8크기의 체스판으로 만들 것
        // 맨 위쪽 위 칸이 흰색인 경우와 검은색인 경우
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new boolean[N][M];
        for(int i=0; i<N; i++) {
            char[] input = br.readLine().toCharArray();
            for(int j=0; j<input.length; j++) {
                if (input[j] == 'W') {
                    map[i][j] = true;
                } else {
                    map[i][j] = false;
                }
            }
        }

        // 8x8 크기의 체스판을 만들려면 돌아야하는 크기
        int N_row = N-7;
        int M_col = M-7;

        // 출발 지점을 설정하는 것이다.
        for(int i=0; i<N_row; i++) {
            for(int j=0; j<M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x+8;
        int end_y = y+8; //x,y의 끝값 설정
        int count = 0;

        boolean TF = map[x][y]; //첫번째 칸의 색

        // 출발 지점에서 8개 확인
        for(int i=x; i<end_x; i++) {
            for(int j=y; j<end_y; j++) {
                // 올바른 색이 아니면 count 1증가
                if (map[i][j] != TF) {
                    count++;
                }

                TF = !TF; //다음칸은 색이 바뀌도록.
            }
            TF = !TF;
        }
        // 전체 다 돌고나서
        // 첫번째 칸을 기준으로 할 때의 count와, 반대되는 색을 기준으로 할 떄의 갯수 비교
        count = Math.min(count, 64 - count);
        //이전까지의 경우 중 최솟값보다 현재 count값이 작을 경우 최솟값 갱신
        min = Math.min(count, min);
    }
}
