class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        char[] chars = my_string.toCharArray();
        
        for (char i : chars) {
            if (answer.toString().contains(i+"")){
                continue;
            } else {
                answer.append(i);
            }
        }
        return answer.toString();
    }
}