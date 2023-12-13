import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어의 개수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        int answer;
        if(input[0].length()==0) {
            answer = 0;
        } else {
            answer = input.length;
        }

        System.out.println(answer);
    }
}

