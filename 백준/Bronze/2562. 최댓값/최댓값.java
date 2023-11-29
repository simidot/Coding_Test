import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[9];
        for(int i=0; i<9; i++) {
            intArray[i] = scanner.nextInt();
        }

        int max = intArray[0];
        int index = 1;
        for (int i=0; i<intArray.length; i++) {
            if (max<intArray[i]) {
                max = intArray[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}