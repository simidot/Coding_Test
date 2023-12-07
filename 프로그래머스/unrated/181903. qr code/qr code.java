class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        // code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어붙인 문자열 반환

        // 1. code를 char 배열로 만들기 > 그러면 index가 생긴다.
        char[] codeArray = code.toCharArray();

        StringBuffer sb = new StringBuffer();
        // 2. 반복문 : 인덱스를 q로 나눈다. > 이때 나머지가 r이면 그 위치(인덱스)의 문자를 get
        for (int i=0; i< codeArray.length; i++) {
            if (i%q == r) {
                sb.append(codeArray[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}