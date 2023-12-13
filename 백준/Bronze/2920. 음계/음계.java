import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//음계
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] intArray = new int[8];
        for (int i=0; i<8; i++) {
            intArray[i]= Integer.parseInt(st.nextToken());
        }

        String answer = " ";
        for(int i=0; i<7; i++) {
            if(intArray[i+1]==intArray[i]+1) {
                answer="ascending";
            } else if(intArray[i+1] ==intArray[i]-1){
                answer="descending";
            } else {
                answer="mixed";
                break;
            }
        }
        System.out.println(answer);

    }
}
