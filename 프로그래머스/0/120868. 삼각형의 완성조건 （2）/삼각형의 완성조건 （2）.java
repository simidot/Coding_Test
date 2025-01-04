import java.util.*; 

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        
        // 삼각형 완성 조건 : a + b > c
        for (int i = max - min + 1; i <= max; i++) {
            answer ++; 
        }
        for (int i = max + 1; i < min + max; i++) {
            answer ++;
        }
        
        return answer;
    }
}