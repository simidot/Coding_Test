import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String[] inputs = sc.nextLine().split(" ");
            if(inputs[0].equals("0")) break;
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            System.out.println(a+b);
        }

    }
}
