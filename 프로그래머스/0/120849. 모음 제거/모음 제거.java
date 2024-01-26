class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        StringBuffer sb = new StringBuffer();
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    chars[i] = 0;
                    break;
                }
            }
            if (chars[i] != 0) {
                sb.append(chars[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}