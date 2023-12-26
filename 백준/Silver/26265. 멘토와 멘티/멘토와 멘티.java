import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 멘토와 멘티 실버5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Pairs> pairs = new ArrayList<>();
        for(int i=0; i<N;i++) {
            String[] inputString = br.readLine().split(" ");
            pairs.add(new Pairs(inputString[0], inputString[1]));
        }

        Collections.sort(pairs, new Pairs());


        StringBuffer sb = new StringBuffer();
        for(int i=0; i<pairs.size(); i++) {
            sb.append(pairs.get(i).mentor).append(" ").append(pairs.get(i).mentee).append("\n");
        }
        System.out.println(sb);

        // N = 멘토-멘티 순서쌍의 수
        // 목록의 정렬을 맡겼다.
        // 멘토를 기준으로 사전 순으로 정렬하되,
        // 멘토가 같은 순서쌍들에 대해선 멘티의 사전 역순으로 정렬한다.
        // 앞 멘토, 뒤 멘티

        // 멘토 배열과 멘티 배열로 받는다.
    }
    
    public static class Pairs implements Comparator<Pairs> {
        private String mentor;
        private String mentee;

        public Pairs() {
        }

        public Pairs(String mentor, String mentee) {
            this.mentor = mentor;
            this.mentee = mentee;
        }

        @Override
        public int compare(Pairs o1, Pairs o2) {
            if (o1.mentor.equals(o2.mentor)) {
                return o2.mentee.compareTo(o1.mentee);
            } else {
                return o1.mentor.compareTo(o2.mentor);
            }
        }
    }
}