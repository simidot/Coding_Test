import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//이분 탐색
//수 찾기 실버4
public class Main {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        //1: 자연수 N이 주어지고
        //2: 다음 준에 A[1] ~ A[N]
        //3: M개
        //4. M개의 수 > 이 수들이 A안에 존재하는지 알아내면 된다
        // 존재하면 1, 존재하지 않으면 0
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 탐색 범위 내의 배열의 중간인덱스를 구한다.
        // 2. 중간 인덱스의 값과 key값을 비교
        // 3. 값이 중간 값보다 작다면 왼쪽 부분을 크다면 오른쪽부분을 탐색/ 같다면 해당 인덱스 반환하고 종료

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < M; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken())) >=0) {
                sb.append("1").append("\n");
            } else {
                sb.append("0").append("\n");
            }
        }
        System.out.println(sb);
    }

    // key 찾으려는 값
    // return key와 일치하는 배열의 인덱스
    public static int binarySearch(int key) {
        int lo = 0;  //탐색 범위의 왼쪽 끝 인덱스
        int hi = arr.length -1; //탐색 범위의 오른쪽 끝 인덱스
        //lo가 hi보다 커지기 전까지 반복
        while (lo <= hi) {
            int mid = (lo+hi)/2; //중간

            if (key < arr[mid]) {
                hi = mid-1;
            } else if (key > arr[mid]) {
                lo = mid+1;
            } else {
                return mid;
            }
        }
        //찾고자 하는 값이 존재하지 않을 때
        return -1;
    }
}
