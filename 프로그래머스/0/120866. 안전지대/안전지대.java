import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        List<int[]> mine = new ArrayList<>();

        // 지뢰 인접한 x, y 값
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};
        
        
        // 지뢰가 나오면 해당 좌표를 int[] 리스트에 저장
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[i][j] == 1) {
                    int[] temp = {i, j};
                    mine.add(temp);
                }
            }
        }
        
        // 저장된 지뢰 좌표를 하나씩 꺼내어 주변 인접 칸들을 1로 만듦.
        for (int z=0; z<mine.size(); z++) {
            int i = mine.get(z)[0];
            int j = mine.get(z)[1];
            for (int v=0; v<8; v++) {
                if (// 지뢰가 있는 기준 8방향
                    dx[v]+i >=0 && dy[v]+j >=0 && 
                    //board 배열을 벗어나지 않아야함.
                    dx[v]+i <=board.length-1 && dy[v]+j <= board.length-1) {
                    board[dx[v]+i][dy[v]+j] = 1;
                }
            }
        }
        
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                } 
            }
        }
        
        return answer;
    }
}