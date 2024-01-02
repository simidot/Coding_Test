import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최대공약수와 최소공배수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(GCD(a, b));
        System.out.println(LCM(a,b));
    }

    //greatest common divisor
    static int GCD(int a, int b){
        int temp=0;
        while(b!=0) {
            temp = b;
            b = a%b;
            a = temp;
        }
        return temp;
    }

    //largest common multiple
    static int LCM(int a, int b) {
        return a*b/GCD(a,b);
    }
}
