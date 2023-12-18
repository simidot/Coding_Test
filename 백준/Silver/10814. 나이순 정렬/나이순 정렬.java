import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 나이순 정렬 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 온라인 저지 회원의 수 N
        int N = Integer.parseInt(br.readLine());

        String[][] members = new String[N][2];
        // 각 회원의 나이와 이름이 주어짐.
        for (int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");

            members[i][0] = inputs[0];
            members[i][1] = inputs[1];
        } // 멤버정보 입력 완료

        // 출력은 나이순, 나이가 같으면 가입한 순으로 한 줄에 한명식 나이와 이름을 공백으로 구분해 출력.
        Arrays.sort(members, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1].compareTo(o2[1]);
            } else {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(members[i][0]+" "+members[i][1]+"\n");
        }
        System.out.println(sb);
    }
}

