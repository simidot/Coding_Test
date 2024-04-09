import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 가장 긴 변의 길이 <= 다른 두 변의 길이의 합
        // 만들수있으면 1, 없으면2
        int max = 0;
        int sum = 0;
        for(int i=0; i<3; i++){
            sum += sides[i];
            if (sides[i] > max){
                max = sides[i];
            }
        }
        if (max < sum-max){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}