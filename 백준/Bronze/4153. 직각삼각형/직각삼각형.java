import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 직각삼각형 브론즈3
public class Main {
    public static void main(String[] args) throws IOException {
        //주어진 세변의 길이로 삼격형이 직각인지 아닌지 구분
        // 마지막 줄은 0 0 0
        // 각 입력은 변의 길이
        // 직각 삼각형이면 right 아니면 wrong
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while(!(str=br.readLine()).equals("0 0 0")){
            String[] inputs = str.split(" ");
            int[] nums = new int[inputs.length];

            for (int i=0; i<inputs.length; i++) {
                nums[i] = Integer.parseInt(inputs[i]);
            }

            Arrays.sort(nums);

            if (nums[0]*nums[0] + nums[1]*nums[1] == nums[2]*nums[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}
