import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//설탕 배달 실버 4
public class Main {
    public static void main(String[] args) throws IOException {
        // 설탕을 N킬로그램 배달해야 한다.
        // 3킬로&5킬로 봉지
        // 최대한 적은 봉지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int bag=0;
        if(N==4 || N==7) {
            bag = -1;
        } else if (N%5==0) {//5의 배수일 때는 나눠주면 된다.
            bag = N / 5;
        } else if (N%5==1 || N%5==3) { // 5의배수+1 또는 5의배수+3인 경우
            bag = N/5 +1;
        } else if (N%5==2 || N%5==4) { // 5의배수+2 또는 5의배수+4인 경우
            bag = N/5 +2;
        }
        System.out.println(bag);
    }
}
