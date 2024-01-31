import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 정렬
// ATM 실버 4
public class Main {
    public static void main(String[] args) throws IOException {
        // 1. ATM 앞에 줄서있는 사람들 N명
        // 2. 각 사람이 돈을 인출하는데 걸리는 시간 P
        // = 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] people = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(people);
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i] * (people.length - i);
        }
        System.out.println(sum);
    }
}
