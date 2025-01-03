import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        List<String> strList = new ArrayList<>();
        
        for (int i=0; i < my_str.length(); i+=n) {
            if (i+n < my_str.length()) {
                strList.add(my_str.substring(i, i+n));
            } else {
                strList.add(my_str.substring(i));
            }
        }
        
        answer = strList.toArray(new String[my_str.length()/n]);
        
        return answer;
    }
}