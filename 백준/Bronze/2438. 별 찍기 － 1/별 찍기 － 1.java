import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i=0; i<input; i++) {
            for (int j=input-i; j<=input; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
