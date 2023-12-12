import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

// 엄청난 부자2
public class Main {
    public static void main(String[] args) {
        // 돈을 똑같이 분배 + 동일하게 분배하고 남은 돈?
        // 조교가 가진 돈 n / 돈을 받으러 온 생명체의 수 m
        Scanner sc = new Scanner(System.in);
        
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        sc.close();

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

    }
}
