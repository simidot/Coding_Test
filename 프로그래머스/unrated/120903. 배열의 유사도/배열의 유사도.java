class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        // s1과 s2의 같은 원소의 개수를 return
        for(int i=0; i<s1.length; i++) {
            for (int j=0; j<s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}