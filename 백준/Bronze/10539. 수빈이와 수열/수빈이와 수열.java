import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수빈이와 수열
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // B 수열의 크기
        int num = Integer.parseInt(br.readLine());

        // 그 수열의 크기만큼 정수 입력받기 (수열 B)
        int[] sequenceB = new int[num];
        String[] strings = br.readLine().split(" ");
        for(int i=0; i<sequenceB.length; i++) {
            sequenceB[i] = Integer.parseInt(strings[i]);
        }

        int[] sequenceA = new int[num];
        int sum = 0;
        // 수열 A 찾기
        for(int i=0; i<sequenceB.length; i++) {
            sequenceA[i] = (i+1)*sequenceB[i] - sum ;
            sum += sequenceA[i];
        }

        for (int i: sequenceA) {
            System.out.print(i+" ");
        }
    }
}
