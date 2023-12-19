import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//윤년
public class Main {
    public static void main(String[] args) throws IOException {
        // 연도가 주어졌을 때 윤년이면 1, 아니면 0 출력
        // 윤년 연도가 4의 배수이면서 100의 배수가 아닐 때
        // 4의 배수이면서 400의 배수일 때
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if (year%4==0) {
            if (year%400==0) {
                System.out.println(1);
            } else if (year%100 !=0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}
