class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        
        StringBuilder lines = new StringBuilder();
        for (int i =0; i<char1.length; i++) {
            lines.append(char1[i]);
            lines.append(char2[i]);
        }
        answer = lines.toString();
        
        return answer;
    }
}