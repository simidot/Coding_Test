class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        char[] controlArray = control.toCharArray();

        for (int i=0; i<controlArray.length; i++) {
            switch(controlArray[i]) {
                case 'w' -> answer += 1;
                case 's' -> answer -= 1;
                case 'd' -> answer += 10;
                case 'a' -> answer -= 10;
            }
        }
        
        return answer;
    }
}