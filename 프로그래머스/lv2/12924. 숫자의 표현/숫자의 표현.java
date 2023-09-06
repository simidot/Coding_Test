class Solution {
    public int solution(int n) {
        int sum =0;
        int count = 0;
        int start = 0;
        int end = 0;
        
        while(end<=n) {
            if (sum < n) {
                sum += ++end;
            } else if (sum > n) {
                sum -= start++;
            } else {
                count++;
                sum += ++end;
            }
        }

        return count;
    }
}