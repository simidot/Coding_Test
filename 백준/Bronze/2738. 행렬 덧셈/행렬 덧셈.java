import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 행렬의 덧셈
public class Main {
    public static void main(String[] args) throws IOException {
        // 행렬 A, B
        // N*M 크기의 행렬 두개 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = br.readLine().split(" ");

        int N = Integer.parseInt(inputArray[0]);
        int M = Integer.parseInt(inputArray[1]);

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] result = new int[N][M];

        // 첫 N개의 줄의 것들을 A에 넣기
        for(int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");

            for (int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        // 다음 N개의 줄의 것들을 B에 넣기
        for (int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j=0; j<M; j++) {
                B[i][j] = Integer.parseInt(inputs[j]);
            }

        }

        // 각 행렬을 더한 것 출력 A[0][0]+B[0][0] ~ A[N][M] + B[N][M]
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                result[i][j] += A[i][j] + B[i][j];
            }
        }

        // 출력
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<N; i++) {
            // 각줄 출력
            for (int j=0; j<M; j++) {
                answer.append(result[i][j]);
                answer.append(" ");
            }
            // 한줄 끝나면
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
