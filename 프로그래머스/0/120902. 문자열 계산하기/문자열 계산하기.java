class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] splitS = my_string.split(" ");
        
        answer += Integer.parseInt(splitS[0]);
        
        for (int i=1; i<splitS.length-1; i++) {
            if (splitS[i].equals("+")) {
                answer += Integer.parseInt(splitS[i+1]);
            } 
            
            if (splitS[i].equals("-")) {
                answer -= Integer.parseInt(splitS[i+1]);
            }
        }
        
        return answer;
    }
}