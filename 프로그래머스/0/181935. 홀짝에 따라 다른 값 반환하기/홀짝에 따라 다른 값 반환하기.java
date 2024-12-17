class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) {
            for (int i=n; i>0; i-=2) {
                answer += i;
            } 
        } else {
            answer = n*n;
            for (int i=n; i>0; i-=2) {
                answer += (n-i) * (n-i);
            }
        }
        
        return answer;
    }
}