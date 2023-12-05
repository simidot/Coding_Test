class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(a+""+b);
        int compare = 2*a*b;

        if (ab >= compare) {
            answer = ab;
        } else {
            answer = compare;
        }

        return answer;
    }
}