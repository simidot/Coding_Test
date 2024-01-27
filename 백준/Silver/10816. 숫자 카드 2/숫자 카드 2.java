import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//숫자 카드 2 실버 4
public class Main {
    public static void main(String[] args) throws IOException {
        //첫째줄 : 상근이는 숫자카드 N개 갖고있음
        //둘째줄 : 숫자카드에 적혀있는 정수
        //셋째줄 : 정수 M개 주어졌을 때
        //넷째줄 : 상근이가 몇 개 가지고 있는 숫자카드인지 구해야할 M개의 정수가 주어진다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] countArray = new int[20000001];
        //상근이가 갖고있는 숫자카드 개수
        int N = Integer.parseInt(br.readLine());
        //상근이가 갖고 있는 숫자카드 배열
//        int[] myCards = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            countArray[Integer.parseInt(st.nextToken())+10000000]++;
        }
        StringBuffer sb = new StringBuffer();

        // 주어진 숫자카드 개수
        int M = Integer.parseInt(br.readLine());
        // 주어진 숫자카드 배열
//        int[] givenCards = new int[M+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            sb.append(countArray[Integer.parseInt(st.nextToken()) + 10000000]).append(" ");
        }
        br.close();

        System.out.println(sb);
    }
}
