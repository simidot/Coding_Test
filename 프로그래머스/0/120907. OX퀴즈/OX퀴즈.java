import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            
            int left = split[1].equals("+") ? Integer.parseInt(split[0]) + Integer.parseInt(split[2]) : Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
            int right = Integer.parseInt(split[4]);
            
            answer[i] = left == right ? "O" : "X";
        }
        
        
        return answer;
    }
}