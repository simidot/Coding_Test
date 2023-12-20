import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//벌집 브론즈2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        //중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매긴다.
        // 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇개의 방을 지나가는지
        // 시작과 끝 포함하여 계산

        boolean changed = false;
        for(int i=0; i<input; i++) {
            int sum = 1;
            for (int j=0; j<input; j++) {
                sum += 6*j;

                if (input<=sum) {
                    System.out.println(j+1);
                    changed = true;
                    break;
                }
            }
            if(changed) break;
        }
    }
}
