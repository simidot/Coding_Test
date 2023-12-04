class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        // 첫째항 a, 공차 d 등차수열
        int[] numbers = new int[included.length];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = a + d*i;
        }

        // 1항부터 n항까지 돌아보며 included가 true인 항 골라 더하기
        for (int i=0; i<numbers.length; i++) {
            if (included[i]== true) {
                answer += numbers[i];
            }
        }

        return answer;
    }
}