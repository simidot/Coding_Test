import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        List<Integer> intList = new ArrayList<>();
        while(num != 0) {
            intList.add(num % 10);
            num = num/10;
        }
        
        Collections.reverse(intList); 
        
        for (int i=0; i<intList.size(); i++) {
            if (intList.get(i) == k) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}