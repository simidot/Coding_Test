class Solution {
    public int[][] solution(int[] num_list, int n) {
         // 정수배열 num_list를 2차원 배열로 바꿔 반환
        // 길이가 8이고 n이 2이면 2*4배열로 바꿔 변환
        int length = num_list.length;

        int[][] answer = new int[length/n][n];

        int index = 0;
        for(int i=0; i<length/n; i++) {
            for (int j=0; j<n; j++) {
                answer[i][j] = num_list[index++];
            }
        }

        return answer;
    }
}