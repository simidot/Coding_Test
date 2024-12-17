import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        // answer = new int[arr.size()];
        for (int i=1; i<=n; i++) {
            if (n%i == 0){
                arr.add(i);
            }
        }
        
        int[] answer =new int[arr.size()];

        
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}