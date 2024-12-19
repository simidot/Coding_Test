class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^\\d]", " ");
        
        String[] split = my_string.split(" ");
        for (String one: split) {
            if (!one.isEmpty()) {
                answer += Integer.parseInt(one);
            }
        }
        
        return answer;
    }
}