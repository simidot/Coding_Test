import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 2;

        // 최대공약수 구하기
        int max = 0; // 최대공약수
        for (int i=1; i<=a && i<=b; i++) {
            if (a%i==0 && b%i==0) {
                max = i;
            }
        }

        // 분수를 기약분수로 만들기 > 분자와 분모의 최대공약수로 약분하기.
        int d= b/max;

        // 기약분수의 분모의 소인수 구하여 return값 결정.
        while (d%2==0) {
            d /=2;
        }
        while (d%5==0) {
            d /=5;
        }
        if (d==1) {
            answer =1;
        } else {
            answer =2;
        }

        return answer;
    }
}