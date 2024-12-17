class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            char thisChar = my_string.charAt(i);
            if (thisChar >=65 && thisChar < 91) {
                thisChar += 32;
                sb.append(thisChar);
            } else {
                thisChar -= 32;
                sb.append(thisChar);

            }
        }
        
        answer = sb.toString();
        return answer;
    }
}