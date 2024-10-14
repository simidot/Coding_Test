import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
                String answer = "";

        // participant = 마라톤 참여 선수들의 이름
        // completion = 완주한 선수들의 이름
        // 단 한 명 완주하지 못한 선수들의 이름을 return
        // 동명이인이 있다.

  HashMap<String, Integer> result = new HashMap<>();

        for (String player : participant) {
            result.put(player, result.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            result.put(player, result.get(player) -1);
        }

        for (String key : result.keySet()) {
            if (result.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}