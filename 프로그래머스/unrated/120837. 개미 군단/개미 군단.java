class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 장군개미는 5, 병정개미는 3, 일개미는 1 공격력
        // 체력 23이라면 > 장군개미 4마리, 병정개미 1마리 최소로 필요
        while (hp!=0) {
            answer += hp/5;
            hp = hp%5;
            answer += hp/3;
            hp = hp%3;
            answer += hp/1;
            hp = hp%1;
        }

        return answer;
    }
}