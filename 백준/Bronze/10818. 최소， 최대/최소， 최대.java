import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최소, 최대
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        String[] inputs = br.readLine().split(" ");

        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        int max = nums[0];
        int min = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        System.out.println(min + " " + max);
    }
}
