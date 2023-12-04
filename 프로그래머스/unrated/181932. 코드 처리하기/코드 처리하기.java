class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder ret = new StringBuilder();

        int mode = 0;

        // code를 읽으며 code[idx]가 1이면 mode변환
        for (int i=0; i<code.length(); i++) {
            char letter = code.charAt(i);
            if (letter == '1') {
                if (mode==0) mode= 1;
                else mode=0;
            }
            else {
                if (mode==0 && i%2==0) {
                    ret.append(letter);
                }
                else if (mode==1 && i%2==1) {
                    ret.append(letter);
                }
            }
        }

        // mode가 0일 때 idx가 짝수일 때만 ret의 맨 뒤에 넣음.
        // mode가 1일 때 홀수일 때만 ret 맨 뒤에 넣음.
        answer = ret.toString();

        return answer.isEmpty() ? "EMPTY" : answer;
    }
}