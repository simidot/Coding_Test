class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        // 정수 n이 array에 몇개 있는지
        for(int i=0; i<array.length; i++) {
            if(array[i] == n) {
                answer++;
            }
        }

        return answer;
    }
}