import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        char[] charArr = my_string.toCharArray();
        Arrays.sort(charArr);
        
        
        for (char i: charArr) {
            answer += i;
        }
        
        return answer;
    }
}