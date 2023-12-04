class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int multiply = 1;
        int sum = 0;
        for(int i : num_list) {
            multiply *= i;
        }

        for (int i: num_list) {
            sum += i;
        }

        if (multiply < sum*sum) {
            answer = 1;
        }

        return answer;
    }
}