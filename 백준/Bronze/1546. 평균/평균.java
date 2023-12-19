import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균 브론즈1
public class Main {
    public static void main(String[] args) throws IOException {
        // 자기 점수 중 최댓값을 골라 M
        // 모든 점수를 점수/M*100으로 고침
        // 시험 본 과목의 개수 N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = 0;
        double[] scores = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (max<scores[i]) {
                max = (int)scores[i];
            } //최대 점수 구하기
        }

        double sum = 0;
        for(int i=0; i<scores.length;i++) {
            scores[i] = scores[i]/max*100;
            sum += scores[i];
        }
        System.out.println(sum/N);
    }
}
