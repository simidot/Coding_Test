class Solution {
    public String solution(String my_string, int n) {
           String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            sb.append((c+"").repeat(n));
        }
        answer = sb.toString();
        return answer;
    }
}