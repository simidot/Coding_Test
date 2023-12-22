class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        // 가위는 2, 바위는 0, 보는 5
        // 모두 이기는 경우를 순서대로 문자열로 반환

        char[] rspChar = rsp.toCharArray();
        for(int i=0; i<rspChar.length; i++) {
            if (rspChar[i]=='2') {
                answer.append("0");
            } else if (rspChar[i] == '0') {
                answer.append("5");
            } else {
                answer.append("2");
            }
        }

        return answer.toString();
    }
}