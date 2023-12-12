import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 엄청난 부자2
public class Main {
    public static void main(String[] args) throws IOException {
        // 돈을 똑같이 분배 + 동일하게 분배하고 남은 돈?
        // 조교가 가진 돈 n / 돈을 받으러 온 생명체의 수 m
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] brArray = br.readLine().split(" ");
        BigInteger n = new BigInteger(brArray[0]);
        BigInteger m = new BigInteger(brArray[1]);

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

    }
}
