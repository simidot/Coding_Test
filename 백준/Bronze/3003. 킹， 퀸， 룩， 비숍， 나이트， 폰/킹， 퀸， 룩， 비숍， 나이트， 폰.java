import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 검정색 모두 있음, 흰색은 다 없음
        // 흰색 개수가 주어지면 몇개 더하고빼야할지
        // 킹1, 퀸1, 룩2, 비숍2, 나이트2, 폰8

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = (br.readLine()).split(" ");
        int[] lines = new int[line.length];

        for (int i=0; i<lines.length; i++) {
            lines[i] = Integer.parseInt(line[i]);
        }

        int[] defaultNums = {1, 1, 2, 2, 2, 8};
        int[] answer = new int[6];

        for (int i=0; i<6; i++) {
            answer[i] = defaultNums[i] - lines[i];
        }

        for (int a: answer) {
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
