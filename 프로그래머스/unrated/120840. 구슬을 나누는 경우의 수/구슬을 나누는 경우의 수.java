class Solution {
    public int solution(int balls, int share) {
                int answer = 0;
        //구슬의 개수balls / 친구들에게 나누어 줄 구슬 개수 shar
        // balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수 반환

        // balls개 중 share개 뽑는 것 nCr
        answer = combination(balls, share);
        return answer;
    }

    public static int combination(int balls, int share) {
        if (share == 0 | balls == share) {
            return 1;
        } else {
            return combination(balls - 1, share - 1) + combination(balls - 1, share);
        }
    }
}