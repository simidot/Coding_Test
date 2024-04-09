import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++) {
        // 나누어 떨어지면 i는 소인수
            if (n%i==0) {
                //몫이 2이상인 경우도 있기 때문에 안나눠질때까지 나눠줌.
                while (n%i==0) {
                    n/=i;
                }
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}