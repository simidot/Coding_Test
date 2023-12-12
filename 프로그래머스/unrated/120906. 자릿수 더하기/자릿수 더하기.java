class Solution {
    public int solution(int n) {
        int answer = 0;

        // 정수 n의 각 자리의 합
        while(n>0) {
            answer+=n%10;
            n /= 10;
        }

        return answer;
    }
}