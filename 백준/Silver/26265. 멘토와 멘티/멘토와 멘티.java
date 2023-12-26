import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 멘토와 멘티 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        // N = 멘토-멘티 순서쌍의 수
        // 목록의 정렬을 맡겼다.
        // 멘토를 기준으로 사전 순으로 정렬하되,
        // 멘토가 같은 순서쌍들에 대해선 멘티의 사전 역순으로 정렬한다.
        // 앞 멘토, 뒤 멘티

        // 멘토 배열과 멘티 배열로 받는다.

        String[][] pairs = new String[N][2];

        for(int i=0; i<N; i++) {
            String[] inputString = br.readLine().split(" ");
            pairs[i][0] = inputString[0];
            pairs[i][1] = inputString[1];
        }

        Arrays.sort(pairs, (o1, o2) -> {
            if (o1[0].compareTo(o2[0])==0) {
                return o2[1].compareTo(o1[1]);
            } else {
                return o1[0].compareTo(o2[0]);
            }
        });
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<N; i++) {
            sb.append(pairs[i][0] + " " + pairs[i][1]+"\n");
        }
        System.out.println(sb);

    }
}
