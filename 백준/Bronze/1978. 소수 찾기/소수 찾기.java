import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

// 소수 찾기 브론즈 2
public class Main {
    public static void main(String[] args) throws IOException {
        //주어진 수 N개중에서 소수가 몇개인지 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] intArray = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i=0; i<intArray.length; i++) {
            boolean sosuCheck = true;

            if (intArray[i]==1) {
                sosuCheck=false;
            }
            for(int j=2; j<intArray[i]; j++) {
                if (intArray[i]%j==0) {
                    sosuCheck = false;
                    break;
                }
            }
            if (sosuCheck) {
                count++;
            }

        }

        System.out.println(count);
    }
}
