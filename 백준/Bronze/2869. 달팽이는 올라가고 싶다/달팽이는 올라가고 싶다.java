import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 달팽이는 올라가고 싶다.
public class Main {
    public static void main(String[] args) throws IOException {
        // 높이 V미터 나무막대에 오름
        // A미터 올라가고
        // B미터 떨어짐
        // 정상에 올라가려면 얼마나 걸리는지

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = br.readLine().split(" ");

        int A = Integer.parseInt(inputArray[0]);
        int B = Integer.parseInt(inputArray[1]);
        int V = Integer.parseInt(inputArray[2]);

        int days = (V-B)/(A-B);

        if((V-B)%(A-B) !=0) {
            days++;
        }
        
        System.out.println(days);
    }
}
