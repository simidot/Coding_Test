class Solution {
    public int solution(int n) {
        int answer = 0;
        int not = 0;
        //약수의 개수가 세개 이상이면 합성수
        // n이하의 합성수의 개수를 return
        for (int i = 1; i <= n; i++) {
            int number = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    number++;
                }
            }
            if (number >= 3) {
                answer++;
            }
        }
        return answer;
    }
}