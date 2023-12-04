import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//카이사르 암호
public class Main {
    public static void main(String[] args) throws IOException {
        // 카이사르 단어 입력 받음.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] inputChar = input.toCharArray();
        char[] answer = new char[inputChar.length];

        for (int i=0; i<inputChar.length; i++) {
            switch(inputChar[i]) {
                case 65:
                    answer[i] = 'X';
                    break;
                case 66:
                    answer[i] = 'Y';
                    break;
                case 67:
                    answer[i] = 'Z';
                    break;
                default:
                    answer[i] = (char) (inputChar[i] - 3);
            }
        }

        for (char i : answer) {
            System.out.print(i);
        }

    }
}
