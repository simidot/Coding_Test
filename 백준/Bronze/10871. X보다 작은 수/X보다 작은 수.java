import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// X보다 작은 수 브론즈5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int X = Integer.parseInt(inputs[1]);

        int[] nums = new int[N];
        String[] inputNums = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(inputNums[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] < X) {
                sb.append(nums[i]+" ");
            }
        }
        System.out.println(sb);

    }
}
