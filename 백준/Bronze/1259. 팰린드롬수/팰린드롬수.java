import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            int a = scanner.nextInt();
            if (a == 0)
                break;
            if (a < 10)
                System.out.println("yes");
            else if (a < 100)
            {
                if (a / 10 == a % 10)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else if (a < 1000)
            {
                if (a / 100 == a % 10)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else if (a < 10000)
            {
                if (a / 1000 == a % 10 && (a % 1000) / 100 == (a % 100) / 10)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else if (a < 100000)
            {
                if (a / 10000 == a % 10 && (a % 10000) / 1000 == (a % 100) / 10)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
    }
}