class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;

        // 직육면체 모양의 상자를 갖고 있다.
        // 이 상자에 정육면체 모양의 주사위를 최대한 채우고싶다.
        // box [가로, 세로, 높이]
        // 주사위 모서리의 길이 n
        // 상자에 들어갈 수 있는 주사위의 최대 개수를 반환

        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);

        return answer;
    }
}