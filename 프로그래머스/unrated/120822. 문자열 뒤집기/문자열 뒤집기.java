class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] string = my_string.toCharArray();
        StringBuffer sb = new StringBuffer();

        for(int i=string.length-1; i>=0; i--) {
            sb.append(string[i]);
        }
        answer = sb.toString();
        return answer;
    }
}