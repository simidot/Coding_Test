import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
                String answer = "";

        // participant = 마라톤 참여 선수들의 이름
        // completion = 완주한 선수들의 이름
        // 단 한 명 완주하지 못한 선수들의 이름을 return
        // 동명이인이 있음.

        Arrays.sort(participant);
        Arrays.sort(completion);
        
        answer = participant[participant.length-1];
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}