import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 거스름돈
        int change = Integer.parseInt(br.readLine());
        // 동전의 최소 개수를 출력 , 거슬러 줄 수 없으면 -1 출력
        // 5원짜리와 2원짜리

        // 거슬러줄 수 없는 경우 (1, 3)
        if (change == 1 || change == 3) {
            System.out.println("-1");
        }
        // 5짜리로 다 거슬러주면 짝수 금액이 남는 경우
        else if ((change % 5) % 2 == 0) {
            int fives = change/5;
            int twos = (change%5)/2;
            System.out.println(fives + twos);
        }
        // 5짜리로 다 거슬러주면 홀수 금액이 남는 경우
        else {
            // 5짜리로 쓸수있는 만큼 -1 (해야 남는 돈을 2원으로 거스를 수 잇음)
            int fives = change/5 -1;
            int twos = ((change%5)+5)/2;
            System.out.println(fives+twos);

        }


    }
}
