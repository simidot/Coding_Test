class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] msWords = {"aya", "ye", "woo", "ma"};
        
        // 조카가 가능한 옹알이를 " " 공백으로 변환
        for (int i=0; i<babbling.length; i++) {
            for (int j=0; j<msWords.length; j++) {
                babbling[i] = babbling[i].replace(msWords[j], " ");
            }
        } 
        // 전체 단어가 공백으로 변환되었을 경우 +1
        for (int i=0; i<babbling.length; i++) {
            if (babbling[i].trim().length()==0) answer++;
        }
        
        return answer;
    }
}