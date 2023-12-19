class Solution {
    public int solution(int price) {
        int answer = 0;

            //10만원 이상사면 5퍼
            // 30만원 이상사면 10퍼
            // 50만원 이상사면 20퍼 할인
            // 지불해야할 금액 소수점 이하 버린 정수

        if (price < 100000) {
            answer = price;
        } else if (price < 300000) {
            answer = (int)(price*0.95);
        } else if (price < 500000) {
            answer = (int)(price*0.9);
        } else {
            answer = (int)(price*0.8);
        } 
        return answer;
    }
}