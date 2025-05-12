import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String ans = "";
        for(String s: str) {
            ans += s;
        }
        answer = Long.parseLong(ans);
        return answer;
    }
}