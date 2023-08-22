class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++) {
            boolean sosuCheck = true;
            for (int j=2; j<=(int)(Math.sqrt(i)); j++) {
                if (i%j==0) {
                    sosuCheck = false;
                    break;
                }      
            }
            if (sosuCheck == true) {
                answer++;
            }
        }

        return answer;
    }
}