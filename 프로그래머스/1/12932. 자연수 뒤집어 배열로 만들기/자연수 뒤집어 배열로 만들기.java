import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        List<Long> numL = new ArrayList<>();
        while(n>0) {
            long num = n % 10;
            numL.add(num);
            n /= 10;
        }
        
        int[] answer = new int[numL.size()];
        
        for(int i=0; i<numL.size(); i++) {
            answer[i] = numL.get(i).intValue();
        }
        
        
        
        return answer;
    }
}