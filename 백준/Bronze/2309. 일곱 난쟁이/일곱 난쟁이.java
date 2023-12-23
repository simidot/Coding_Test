import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
public class Main {
    // 그 해당 조합의 합
    public  static boolean check = false;

    public static void main(String[] args) throws IOException {
        // 아홉 난쟁이의 키가 주어졌을 때,
        // 일곱 난쟁이의 키의 합이 100이다.
        // 찾아서 오름차순으로 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nine = new int[9];
        for(int i=0; i<9; i++) {
            nine[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nine); // 오름차순 정렬함.

        // 9C7인데, 합이 100이어야 함.
        combination(nine, 7, 0, 0, new int[7]);

    }

    public static void combination(
            int[] nums, int r,
            int depth,
            int next, //
            int[] arr // 조합 모아놓는 배열
    ) {
        int sum = 0;

        if ((depth==r) && (check == false)) {
            for(int i=0; i<arr.length; i++) {
                sum+= arr[i];
                if (sum==100) {
                    for(int j: arr) {
                        System.out.println(j);
                    }
                    check = true;
                }
            }
        } else if (next == nums.length || check==true) {
            return;
        } else {
            arr[depth] = nums[next];
            combination(nums, r, depth + 1, next + 1, arr);
            combination(nums, r, depth, next+1, arr);
        }

    }
}
