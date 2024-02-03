import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};

        char[] charArray = my_string.toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 47 && charArray[i] <58){
                list.add(String.valueOf(charArray[i]));
            }
        }

        answer = list.stream().mapToInt(value -> Integer.parseInt(value)).sorted().toArray();

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}