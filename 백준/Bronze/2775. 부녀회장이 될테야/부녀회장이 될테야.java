import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//부녀회장이 될테야 브론즈1
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //각 층의 사람들을 모아 반상회
        // 테스트케이스 수 T
        int T = Integer.parseInt(br.readLine());

        // 아파트 이차원 배열 (0층부터 14층까지/ 0호부터 14호까지 있으므로)
        int[][] apartment = new int[15][15];

        for(int i=0; i<apartment.length; i++) {
            apartment[i][1] = 1; //각 층의 1호에는 1
            apartment[0][i] = i; //0층의 i호에는 i명이 산다.
        }

        for(int i=1; i<apartment.length; i++) { //층
            for(int j=2; j<apartment[i].length; j++) { //호
                apartment[i][j] = apartment[i-1][j] + apartment[i][j-1];
            }
        }

        // 각 케이스마다 첫번쨰줄 k, 두번째줄 n >> k층의 n호에는 몇명이 살고있는지 출력
        // a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 데려와서 살아야함
        // 0층부터 있고 각 층에는 1호부터 있으며 0층의 i호에는 i명이 산다.
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apartment[k][n]);
        }

    }
}
