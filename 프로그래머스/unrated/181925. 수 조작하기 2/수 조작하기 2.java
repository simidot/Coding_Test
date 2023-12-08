class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        StringBuffer sb = new StringBuffer();

        for (int i=1; i<numLog.length; i++) {
            int diff = numLog[i] - numLog[i-1]; // 얼마나 조작되었는지 알 수 있다.

            switch (diff) {
                case 1: sb.append("w");
                break;
                case -1: sb.append("s");
                break;
                case 10: sb.append("d");
                break;
                case -10: sb.append("a");
                break;
            }
        }
        // 조작 문자열 반환
        answer = sb.toString();
        return answer;
    }
}