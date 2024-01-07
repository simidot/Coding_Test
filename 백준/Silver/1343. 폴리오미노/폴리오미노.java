import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 폴리오미노 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        //보드판은 . & X로 이루어짐
        // 겹침없이 X를 모두 폴리오미노로 덮을 것.
        //폴리오미노는 AAAA & BB
        // .은 폴리오미노로 덮으면 안됨.
        // 덮을 수 없으면 -1출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input= br.readLine();

        String s = input.replace("XXXX", "AAAA");
        String result = s.replace("XX", "BB");

        if (result.contains("X")) {
            result = "-1";
        }
        System.out.println(result);
    }

}

