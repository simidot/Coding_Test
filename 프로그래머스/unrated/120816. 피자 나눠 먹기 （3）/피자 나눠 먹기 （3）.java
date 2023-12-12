class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        // 원하는 조각수 2~7까지 (slice)
        // 피자 먹는 사람수 (n)
        // n명의 사람이 최소 한 조각 이상 먹으려면 최소 몇판?
        for(int i=1; i<=n; i++) {
            if (n <= slice*i) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}