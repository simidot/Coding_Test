class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        // MxN 크기를 1x1로 가위질 하는 횟수 
        answer = M*N -1;
        return answer;
    }
}