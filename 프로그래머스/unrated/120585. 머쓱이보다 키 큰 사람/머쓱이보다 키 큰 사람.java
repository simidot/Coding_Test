class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        // 머쓱이보다 키 큰 사람 수 return
        for(int i=0; i<array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }

        return answer;
    }
}