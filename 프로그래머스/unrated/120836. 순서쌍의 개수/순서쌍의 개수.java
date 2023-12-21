class Solution {
    public int solution(int n) {
       int answer = 0;
        //두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍 (a,b)
        // 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 반환
        int x = (int)(Math.sqrt(n));

        for(int i=1; i<=x; i++){
            for (int j=1; j<=n; j++) {
                if (i*j==n) {
                    if(i==j) {
                        answer++;
                    } else {
                        answer += 2;
                    }
                }
            }
        }
        return answer;
    }
}