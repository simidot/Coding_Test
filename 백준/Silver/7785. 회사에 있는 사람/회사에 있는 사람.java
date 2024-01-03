import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 회사에 있는 사람 실버 5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출입기록의 수 n
        int n = Integer.parseInt(br.readLine());

        // 출입기록 순서대로
        Map<String, Boolean> log = new HashMap<>();
        Set<String> names = new HashSet<>();
        for(int i=0; i<n; i++) {
            String[] logString = br.readLine().split(" ");
            names.add(logString[0]);
            boolean leaved = false;
            if (logString[1].equals("leave")) leaved=true;
            log.put(logString[0], leaved);
        }
        // 이름 + enter or leave

        List<String> enterList = new ArrayList<>();
        for (String s : log.keySet()) {
            if(!log.get(s)){
                enterList.add(s);
            }
        }
        
        // 회사에 있는 사람을 사전 역순으로 출력
        enterList.sort(Comparator.reverseOrder());
        for (String s : enterList) {
            System.out.println(s);
        }
    }
}
