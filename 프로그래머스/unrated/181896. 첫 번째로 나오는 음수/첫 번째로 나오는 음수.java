class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num = 0;

        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] < 0) {
                num = num_list[i];
                answer = i;
                break;
            }
        }
        if (num==0) {
            answer = -1;
        }
        
        return answer;
    }
}