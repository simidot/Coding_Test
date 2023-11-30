import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];
        int[] c = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.nextInt();
        }
        int max = -1;
        int sum = 0;
        int check = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (max < c[j]) {
                    max = c[j];
                    check = j;
                }
            }
            sum += b[i] * max;
            max = -1;
            c[check] = -1;
        }
        System.out.println(sum);
    }
}