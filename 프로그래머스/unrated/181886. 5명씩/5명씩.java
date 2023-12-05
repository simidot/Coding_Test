import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
       String[] answer = {};
        List<String> nameList = new ArrayList<>();

        for (int i=0; i<names.length; i+=5) {
            nameList.add(names[i]);
        }

        answer = nameList.toArray(answer);
        return answer;
    }
}