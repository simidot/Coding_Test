import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        if (Arrays.equals(beforeChar, afterChar)) answer = 1;
        
        return answer;
    }
}