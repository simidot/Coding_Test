import java.util.Arrays;

class Solution {
    public static int solution(int a, int b, int c) {
        int answer = 0;

        int[] array = {a, b, c};
        Arrays.sort(array);

        // 1. 0번원소와 2번 원소가 동일하면 3개 일치
        // 2. 0번원소와 1번원소가 같거나 (||) 1번 원소와 2번 원소가 같을때
        // 3. 0,1,2 다 다를때

        if (array[0] == array[2]) {
            answer = (a+b+c) * (a*a+b*b+c*c) * (a*a*a + b*b*b+ c*c*c);
        } else if (array[0] == array[1] ||array[1] == array[2]) {
            answer =(a+b+c) * (a*a+b*b+c*c);
        } else {
            answer = a+b+c;
        }
        return answer;
    }
}