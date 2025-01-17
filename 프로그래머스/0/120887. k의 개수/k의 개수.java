class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String strK = String.valueOf(k);
        for (int l=i; l<=j; l++) {
            String strL = String.valueOf(l);
            if (strL.contains(strK)) {
                String[] array = strL.split("");
                for (String a: array) {
                    if (a.equals(strK)) answer++;
                }
            }
        }
        
        
        return answer;
    }
}