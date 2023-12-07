import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

// 단어 정렬 (실버5)
public class Main {
    public static void main(String[] args) throws IOException {
        // 단어가 들어오면 길이가 짧은 것부터 정렬
        // 길이가 같으면 사전 순으로
        // 중복된 단어는 하나만 남김.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어의 개수 입력 받기
        int nums = Integer.parseInt(br.readLine());

        // 단어 입력 받는 배열
        Set<String> sets = new HashSet<String>();

        for (int i=0; i<nums; i++) {
            sets.add(br.readLine());
        }

        // 중복 단어 제거한 후 String 배열에 담음.
        String[] words = sets.toArray(new String[0]);

        // 그 배열을 알파벳 순으로 정렬
//        Arrays.sort(words);

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() - o2.length() == 0) {
                    return o1.compareTo(o2); //사전순
                } else {
                    return o1.length() - o2.length(); // 길이순
                }
            }
        });

         for(String s: words) {
            System.out.println(s);
        }
    }
}
