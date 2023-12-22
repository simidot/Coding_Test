
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        StringBuffer answer = new StringBuffer();

        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<String, Character> morseMap = new HashMap<>();

        for (int i=0; i<morse.length; i++) {
            morseMap.put(morse[i], (char)(i+97) );
        }

        String[] interpret = letter.split(" ");
        for(String i: interpret) {
            answer.append(morseMap.get(i));
        }

        return answer.toString();
    }
}