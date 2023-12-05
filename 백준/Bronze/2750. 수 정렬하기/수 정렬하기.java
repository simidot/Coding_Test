import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수 정렬하기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<nums.length-1; i++) {
            boolean swapCheck = false;

            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapCheck = true;
                }
            }
            if (swapCheck==false) break;
        }

        for (int i: nums) {
            System.out.println(i);
        }
    }
}
