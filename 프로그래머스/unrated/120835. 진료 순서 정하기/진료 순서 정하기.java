import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        // 환자의 응급도 기준으로 진료순서

        int[] newArray = Arrays.stream(emergency).sorted().toArray();
        for (int i=0; i<emergency.length; i++) {
            for(int j=0; j<newArray.length; j++) {
                if (emergency[i]==newArray[j]) {
                    answer[i] = newArray.length-j;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}