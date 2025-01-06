class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int widthLimit = board[0]/2;
        int heightLimit = board[1]/2;
        
        int x = 0;
        int y = 0;
        
        for (String key : keyinput) {
            if (key.equals("left") && x > -widthLimit) {
                x--;
            } else if (key.equals("right") && x < widthLimit) {
                x++;
            } else if (key.equals("up") && y < heightLimit) {
                y++;
            } else if (key.equals("down") && y > -heightLimit) {
                y--;
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}