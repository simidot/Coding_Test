import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//분해합 브론즈2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=1; i<N; i++) {
            int M=i;
            int sum = M;
            List<Integer> numList = new ArrayList<>();
            while(M%10!=0) {
                numList.add(M%10);
                M /= 10;
            }
            for(int j: numList) {
                sum= sum+j;
            }
            if(sum == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}

