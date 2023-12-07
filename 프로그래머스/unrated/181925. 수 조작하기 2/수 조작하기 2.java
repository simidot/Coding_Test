class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        // w+=1, s-=1, d+=10, a-=10

        // 조작할 때마다 결과값을 기록한 정수 배열이 numLog임.
        // numLog[i] => numLog[0]부터 i번의 조작을 가한 결과 저장.
        // numLog[1] = numLog[0] + "조작"
        // numLog[2] = numLog[1] + "조작"

        // 어떤 조작이 이루어졌는지 확인할 배열
        int[] controlList = new int[numLog.length+1];
        StringBuffer sb = new StringBuffer();

        for (int i=1; i<numLog.length; i++) {
            controlList[i-1] = numLog[i] - numLog[i-1]; // 얼마나 조작되었는지 알 수 있다.

            switch (controlList[i-1]) {
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