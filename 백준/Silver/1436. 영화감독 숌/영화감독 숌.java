import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//영화감독 숌 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        // 종말의 수 6이 적어도 3개 이상 연속으로 들어가는 수.
        // N번째로 작은 종말의 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //666 - 1666- 2666 - 3666 - 4666 - 5666 - 6665 - 6666 - 6667 - 6668
        List<String> number = new ArrayList<>();
        int originalNum = 0;
        while (originalNum++<2147483647) {
            String digitNum = String.valueOf(originalNum);
            if (digitNum.contains("666")) {
                number.add(digitNum);
            }
            if (number.size() == N) {
                System.out.println(number.get(N - 1));
                break;
            }
        }
    }
}
