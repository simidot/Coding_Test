import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//나머지
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 10개를 입력받고
        // 각각 42로 나눈 나머지를 구함.
        // 그 값이 총 몇갠지 구함.
        HashSet<Integer> types = new HashSet<>();
        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(br.readLine());
            types.add(n%42);
        }
        System.out.println(types.size());
    }
}
