class Solution {
    public int solution(int n) {
        int answer = 0;

        //피자 한 판은 6조각
        // 모든 사람이 같은 수의 피자를 먹어야 함.
        for(int i=1; i<=n; i++) {
            if ((6*i%n) == 0) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}