class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        sb.reverse();
        answer = sb.toString();
        return answer;
    }
}