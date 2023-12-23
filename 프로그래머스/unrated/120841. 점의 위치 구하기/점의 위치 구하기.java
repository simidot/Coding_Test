class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        // dot = {x, y}
        // dot이 사분면 중 어디에 속하는지 1,2,3,4 중 리턴
        if (dot[0]>0) {
            if (dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if (dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }

        return answer;
    }
}