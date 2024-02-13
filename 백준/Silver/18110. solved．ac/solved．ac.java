import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//solved.ac 실버4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        int criteria = (int)(Math.round(nums.length * 0.15));

        float sum = 0F;
        for (int i = criteria; i < nums.length - criteria; i++) {
            sum += nums[i];
        }
        long s = nums.length - criteria - criteria;
        System.out.println(Math.round(sum / s));
    }
}
