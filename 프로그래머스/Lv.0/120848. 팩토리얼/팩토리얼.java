class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=10; i++) {
            if (factorial(i) <= n) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }

    public static int factorial(int n) {
        if (n >1) {
            return n * factorial(n - 1);
        }
        return n;
    }
}