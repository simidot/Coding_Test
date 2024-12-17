import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        
        StringBuilder sb = new StringBuilder();
        
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        
        // aaabbcccd
        
        for (int i=0; i<charS.length; i++) {
            cnt = 0;
            for (int j=0; j<charS.length; j++) {
                if (charS[i] == charS[j]) {
                  cnt++;  
                } 
            }
            
            if (cnt == 1) {
                sb.append(charS[i]);
            }
            
        }
        
        answer = sb.toString();
        return answer;
    }
}