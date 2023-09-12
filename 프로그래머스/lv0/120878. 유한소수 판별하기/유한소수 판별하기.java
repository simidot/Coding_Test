import java.util.*;

class Solution {    
    public int gcd(int a, int b) { //최대공약수
        while(b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    
    public int solution(int a, int b) {
        int answer = 2;

        // 분수를 기약분수로 만들기 > 분자와 분모의 최대공약수로 약분하기.
        int d= b/gcd(a,b);

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